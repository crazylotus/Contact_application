package com.example.contact

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.widget.NestedScrollView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.example.contact.databinding.FragmentPhoneContactBinding
import com.example.contact.datamodel.ContactsModal
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class PhoneContactFragment : BindingFragment<FragmentPhoneContactBinding>(), PhoneContactListAdapter.ItemOnClickListener  {

    private var REQUEST_CODE = 123

    var alertDialog: AlertDialog? = null

    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentPhoneContactBinding::inflate

    private var permissions = arrayOf(android.Manifest.permission.CALL_PHONE,android.Manifest.permission.READ_CONTACTS,
        android.Manifest.permission.SEND_SMS, android.Manifest.permission.WRITE_CONTACTS)

    lateinit var activityPermissionLauncher : ActivityResultLauncher<Array<String>>
    var isCallPermissionGranted = false
    var isContactPermsionGranted = false
    var isSendSmsPermissionGranted = false
    var isWriteContactPermissionGranted = false

    var page = 0

    lateinit var contactRVAdapter: PhoneContactListAdapter
    var contactsModalArrayList : ArrayList<ContactsModal> = ArrayList()
    private var orgContactList : ArrayList<ContactsModal> = ArrayList()
    lateinit var commonMethods: CommonMethods

    var contactUpdated = true


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        commonMethods = CommonMethods()



        activityPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()){ permissions ->
            isCallPermissionGranted = permissions[android.Manifest.permission.CALL_PHONE] ?: isCallPermissionGranted
            isContactPermsionGranted = permissions[android.Manifest.permission.READ_CONTACTS] ?: isContactPermsionGranted
            isSendSmsPermissionGranted = permissions[android.Manifest.permission.SEND_SMS] ?: isSendSmsPermissionGranted
            isWriteContactPermissionGranted = permissions[android.Manifest.permission.WRITE_CONTACTS] ?: isWriteContactPermissionGranted
            //prepareContactRV()
            contactsModalArrayList.clear()
            orgContactList.clear()
            getContacts(requireContext(),0)
        }
        binding.nestedSv.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->

        })

        binding.searchEt.addTextChangedListener(EditTextTextWatcher(binding.searchEt))

        binding.idFbAdd.setOnClickListener {
            val bundle = Bundle()
            bundle.putBoolean("new",true)
            findNavController().navigate(R.id.action_phoneContackFragment_to_addOrEditContactFragment,bundle)
        }
        prepareContactRV()
        checkPermissions()
    }

    private fun checkPermissions(){
        isCallPermissionGranted = ContextCompat.checkSelfPermission(requireContext(),android.Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED
        isContactPermsionGranted = ContextCompat.checkSelfPermission(requireContext(),android.Manifest.permission.READ_CONTACTS) == PackageManager.PERMISSION_GRANTED
        isSendSmsPermissionGranted = ContextCompat.checkSelfPermission(requireContext(),android.Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED
        isWriteContactPermissionGranted = ContextCompat.checkSelfPermission(requireContext(),android.Manifest.permission.WRITE_CONTACTS) == PackageManager.PERMISSION_GRANTED

        val permissionList : MutableList<String> = ArrayList()

        if(!isCallPermissionGranted)
            permissionList.add(android.Manifest.permission.CALL_PHONE)
        if(!isContactPermsionGranted)
            permissionList.add(android.Manifest.permission.READ_CONTACTS)
        if(!isSendSmsPermissionGranted)
            permissionList.add(android.Manifest.permission.SEND_SMS)
        if(!isWriteContactPermissionGranted)
            permissionList.add(android.Manifest.permission.WRITE_CONTACTS)

        if(permissionList.isNotEmpty()){
            activityPermissionLauncher.launch(permissionList.toTypedArray())
        } else {
            contactsModalArrayList.clear()
            orgContactList.clear()
            getContacts(requireContext(),0)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

    }
    fun getContacts(context: Context,offset : Int) {
        var limit = 10
        var contactId = ""
        var displayName = ""
        var updated = false
        var count = ""
       // commonMethods.showProgressDialog(requireContext())
        // on below line we are calling our content resolver for getting contacts
        // on below line we are calling our content resolver for getting contacts
        CoroutineScope(Dispatchers.IO).launch {
            val cursor: Cursor? = context.contentResolver.query(
                ContactsContract.Contacts.CONTENT_URI,
                null,
                null,
                null,
                ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME + " ASC"
            )

            Log.e("totalContact","Total Contact ${cursor?.count}")
            count = cursor?.count.toString()


            if (cursor?.count!! > 0) {

                while (cursor.moveToNext()) {

                    val hasPhoneNumber =
                        cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER))
                            .toInt()
                    if (hasPhoneNumber > 0) {

                        contactId =
                            cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID))
                        displayName =
                            cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME))

                        val photoUri = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.PHOTO_THUMBNAIL_URI))

                        val phoneCursor: Cursor? = requireContext().contentResolver.query(
                            ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                            null,
                            ContactsContract.CommonDataKinds.Phone.CONTACT_ID + " = ?",
                            arrayOf<String>(contactId),
                            null
                        )

                        if (phoneCursor?.moveToNext() == true) {

                            val phoneNumber = phoneCursor.getString(phoneCursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))

                            val contact = ContactsModal()
                            contact.contactId = contactId
                            contact.userName = displayName
                            contact.contactNumber = phoneNumber
                            contact.image = photoUri?:""

                            contactsModalArrayList.add(contact)
                            orgContactList.add(contact)
                        }
                        phoneCursor?.close()

                        if(orgContactList.size / 100 == 0 && !updated)
                        {
                            updated = true
                            withContext(Dispatchers.Main) {
                                contactRVAdapter.notifyDataSetChanged()
                            }
                        }
                    }
                }
            }
            cursor.close()
            withContext(Dispatchers.Main) {
                binding.textViewHorizontalProgress.visibility = View.GONE
                contactRVAdapter.notifyDataSetChanged()
               // commonMethods.hideProgressDialog()
            }
        }
    }

    private fun showPermissionDialog() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Permission required")
            .setMessage("Some permissions are need to be allowed to use this app without any problems.")
            .setPositiveButton("Settings") { dialog, which -> dialog.dismiss() }
        if (alertDialog == null) {
            alertDialog = builder.create()
            if (!alertDialog?.isShowing!!) {
                alertDialog!!.show()
            }
        }
    }

    private fun prepareContactRV() {
        contactRVAdapter = PhoneContactListAdapter(requireContext(), contactsModalArrayList,this)
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)
        binding.idRvContacts.layoutManager = layoutManager
        binding.idRvContacts.adapter = contactRVAdapter
    }

    inner class EditTextTextWatcher internal constructor(private val view: View?) : TextWatcher {
        override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
            val text=charSequence.toString()
        }
        override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
        @SuppressLint("SuspiciousIndentation")
        override fun afterTextChanged(editable: Editable) {
            val text=editable.toString()
            val filteredContacts = orgContactList.filter {  it.userName!!.contains(text, ignoreCase = true) }
            contactsModalArrayList.clear()
            contactsModalArrayList.addAll(filteredContacts)
            contactRVAdapter.notifyDataSetChanged()

        }
    }

    override fun itemClick(position: Int, details : Boolean) {
        if(details){
            val data = ContactsModal()
            data.contactNumber = contactsModalArrayList.get(position).contactNumber
            data.userName = contactsModalArrayList.get(position).userName
            data.image = contactsModalArrayList.get(position).image
            data.contactId = contactsModalArrayList.get(position).contactId
            val bundle = Bundle()
            bundle.putSerializable("random",false)
            bundle.putSerializable("data",data)
            findNavController().navigate(R.id.action_phoneContackFragment_to_contactDetailsFragment,bundle)
        }else
            makePhoneCall(contactsModalArrayList.get(position).contactNumber!!)
    }
    private fun makePhoneCall(phoneNumber : String){
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber))
        startActivity(intent)
    }
}