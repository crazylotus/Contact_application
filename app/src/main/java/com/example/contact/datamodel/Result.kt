package com.example.contact.datamodel

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Result : Serializable{
    @SerializedName("cell")
    val cell: String=""
    @SerializedName("email")
    val email: String=""
    @SerializedName("gender")
    val gender: String=""
    @SerializedName("id")
    lateinit var id: Id
    @SerializedName("name")
    lateinit var name: Name
    @SerializedName("phone")
    val phone: String=""
    @SerializedName("picture")
    lateinit var picture: Picture
    @SerializedName("load")
    val load : Boolean = false
}

