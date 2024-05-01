package com.example.contact

import android.accounts.AccountManager
import android.content.ContentProviderOperation
import android.content.ContentUris
import android.content.ContentValues
import android.content.Context
import android.content.OperationApplicationException
import android.os.Bundle
import android.os.RemoteException
import android.provider.ContactsContract
import android.provider.ContactsContract.CommonDataKinds.StructuredName
import android.provider.ContactsContract.RawContacts
import android.util.Log
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.example.contact.databinding.FragmentAddOrEditContactBinding
import com.example.contact.datamodel.ContactsModal


class AddOrEditContactFragment : BindingFragment<FragmentAddOrEditContactBinding>() {

    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentAddOrEditContactBinding::inflate

    var edit = false
    lateinit var data : ContactsModal

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.iVBack.setOnClickListener {
            findNavController().popBackStack()
        }

        arguments?.apply {
            edit = getBoolean("new")
            if(!edit){
                data = getSerializable("data") as ContactsModal
                binding.etUserName.setText(data.userName)
                binding.etUserEmail.setText(data.email)
                binding.etUserNumber.setText(data.contactNumber)
                binding.idTVName.text= "Edit Contact"
            }
        }
        binding.addButton.setOnClickListener {
            if(binding.etUserName.text.isNullOrEmpty())
                Toast.makeText(requireContext(),"Enter the name",Toast.LENGTH_LONG).show()
            else if(binding.etUserEmail.text.isNullOrEmpty() || !Patterns.EMAIL_ADDRESS.matcher(binding.etUserEmail.text.toString()).matches())
                Toast.makeText(requireContext(),"Enter the valid E-mail address",Toast.LENGTH_LONG).show()
            else if(binding.etUserNumber.text.isNullOrEmpty())
                Toast.makeText(requireContext(),"Enter the phone number",Toast.LENGTH_LONG).show()
            else
                if(edit)
                    addContact(requireContext(),binding.etUserName.text.toString(),binding.etUserNumber.text.toString())
                else
                    editContact(requireContext(),data.contactId!!.toLong(),binding.etUserName.text.toString(),binding.etUserNumber.text.toString())
        }
    }
    fun editContact(context: Context, contactId: Long, name: String, phoneNumber: String) {
        val ops = ArrayList<ContentProviderOperation>()

        // Update Display Name
        val builder = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI)
        builder.withSelection(
            ContactsContract.Data.CONTACT_ID + "=? AND " +
                    ContactsContract.Data.MIMETYPE + "=?",
            arrayOf(contactId.toString(), ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
        )
        builder.withValue(ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME, name)
        ops.add(builder.build())

        // Update Phone Number
        val builderPhone = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI)
        builderPhone.withSelection(
            ContactsContract.Data.CONTACT_ID + "=? AND " +
                    ContactsContract.Data.MIMETYPE + "=? AND " +
                    ContactsContract.CommonDataKinds.Phone.TYPE + "=?",
            arrayOf(contactId.toString(), ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE,
                ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE.toString())
        )
        builderPhone.withValue(ContactsContract.CommonDataKinds.Phone.NUMBER, phoneNumber)
        ops.add(builderPhone.build())

        try {
            context.contentResolver.applyBatch(ContactsContract.AUTHORITY, ops)
            Toast.makeText(requireContext(),"Contact updated successfully",Toast.LENGTH_LONG).show()
            findNavController().popBackStack(R.id.phoneContackFragment,true)
        } catch (e: Exception) {
            e.printStackTrace()
            // Handle the exception
        }
    }
    fun addContact(context: Context, name: String, phoneNumber: String) {
        val displayName = name
        val mobileNumber = phoneNumber

        // Create a new contact
        val contentValues = ContentValues()
        contentValues.put(ContactsContract.RawContacts.ACCOUNT_TYPE, null as String?)
        contentValues.put(ContactsContract.RawContacts.ACCOUNT_NAME, null as String?)

        // Insert new contact
        val rawContactUri = context.contentResolver.insert(ContactsContract.RawContacts.CONTENT_URI, contentValues)
        val rawContactId = rawContactUri?.lastPathSegment

        // Add name
        val nameValues = ContentValues()
        nameValues.put(ContactsContract.Data.RAW_CONTACT_ID, rawContactId)
        nameValues.put(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
        nameValues.put(ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME, displayName)
        context.contentResolver.insert(ContactsContract.Data.CONTENT_URI, nameValues)

        // Add mobile number
        val mobileNumberValues = ContentValues()
        mobileNumberValues.put(ContactsContract.Data.RAW_CONTACT_ID, rawContactId)
        mobileNumberValues.put(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
        mobileNumberValues.put(ContactsContract.CommonDataKinds.Phone.NUMBER, mobileNumber)
        mobileNumberValues.put(ContactsContract.CommonDataKinds.Phone.TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE)
        context.contentResolver.insert(ContactsContract.Data.CONTENT_URI, mobileNumberValues)
        Toast.makeText(requireContext(),"Contact added successfully",Toast.LENGTH_LONG).show()
        findNavController().popBackStack()
    }
}