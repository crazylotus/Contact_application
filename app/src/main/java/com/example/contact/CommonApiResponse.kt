package com.example.contact

import androidx.lifecycle.LiveData

interface CommonApiResponse {

    fun onSuccessResponse(jsonResponse: LiveData<Any>, requestCode : Int)

    fun onFailureResponse(errorResponse: String,requestCode : Int)
}