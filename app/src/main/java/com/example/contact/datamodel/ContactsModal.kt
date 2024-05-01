package com.example.contact.datamodel

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ContactsModal : Serializable {

    @SerializedName("user_name")
    var userName: String? = null
    @SerializedName("contact_id")
    var contactId: String? = null
    @SerializedName("contact_number")
    var contactNumber: String? = null
    @SerializedName("email")
    var email: String = ""
    @SerializedName("image")
    var image: String? = null

}