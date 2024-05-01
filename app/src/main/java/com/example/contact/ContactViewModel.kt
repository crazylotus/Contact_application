package com.example.contact

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class ContactViewModel  : ViewModel() {


    var responseData = MutableLiveData<Any>()
    private var liveDataResponse = MutableLiveData<Any>()
    val errorMessage = MutableLiveData<String>()
    private val repository: ContactRepository
    lateinit var apiService: ApiService
    var commonInterface: CommonApiResponse? = null

    var job: Job? = null
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        onError("Exception handled: ${throwable.localizedMessage}")
    }
    val loading = MutableLiveData<Boolean>()

    init {
        apiService = ApiService.getInstance()
        repository= ContactRepository(apiService)
    }

    private fun onError(message: String) {
        errorMessage.value = message
        loading.value = false
    }

    fun apiRequest(requestCode : Int, context: Context){
        CoroutineScope(Dispatchers.IO).launch {
            var response: Response<Any>? = null
            when (requestCode) {
                    Enums.REQ_CONTACT_LIST ->{
                        response = repository.getContactList()
                    }

            }

            withContext(Dispatchers.Main) {
                Log.e("response",response.toString())
                if (response!!.isSuccessful) {
                    liveDataResponse.value = response.body()
                    commonInterface?.onSuccessResponse(liveDataResponse, requestCode)
                    Log.e("view-modal","response success")
                    loading.value = false
                } else {
                    commonInterface?.onFailureResponse(
                        response.message(),
                        requestCode
                    )
                    onError("Error : ${response.message()} ")
                    Log.e("view-modal","response failure")
                }
            }
        }
    }
}