package com.example.contact

import retrofit2.Response

class ContactRepository(private val apiService: ApiService) {
    suspend fun getContactList() : Response<Any> {
        return apiService.getContactList()
    }
}