package com.example.contact

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("api/")
    suspend fun getContactList(@Query("results") results : Int =25 , @Query("inc") inc : String ="gender,name,picture,phone,cell,id,email") : Response<Any>

    companion object {
        var apiSerive: ApiService? = null
        fun getInstance() : ApiService {
            if (apiSerive == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://randomuser.me/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                apiSerive = retrofit.create(ApiService::class.java)
            }
            return apiSerive!!
        }

    }
}