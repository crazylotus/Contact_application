package com.example.contact

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.widget.NestedScrollView
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.example.contact.databinding.FragmentRandomContactBinding
import com.example.contact.datamodel.*
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.google.gson.stream.JsonReader
import java.io.StringReader


class RandomContactFragment() : BindingFragment<FragmentRandomContactBinding>(),CommonApiResponse,ContactListAdapter.ItemOnClickListener {

    private lateinit var contactViewModel: ContactViewModel

    private var REQUEST_CODE = 123
    var position = 0

    private var contactList : ArrayList<Result> = ArrayList()
    private var OrgContactList : ArrayList<Result> = ArrayList()
    private lateinit var contactListAdapter: ContactListAdapter
    var page = 1

    lateinit var commonMethods: CommonMethods

    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentRandomContactBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        contactViewModel = ViewModelProvider(this).get(ContactViewModel::class.java)
        contactViewModel.commonInterface = this
        commonMethods = CommonMethods()


        if(contactList.size==0){
            commonMethods.showProgressDialog(requireContext())
            contactViewModel.apiRequest(Enums.REQ_CONTACT_LIST,requireContext())
        }


        contactListAdapter = ContactListAdapter(contactList,requireContext(),this)

        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL,false)

        binding.rvContactlist.layoutManager = layoutManager
        binding.rvContactlist.adapter = contactListAdapter
        binding.rvContactlist.setHasFixedSize(true)

        binding.nestedSv.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->

            if (scrollY == v.getChildAt(0).measuredHeight - v.measuredHeight) {
               if(page<=5){
                   binding.progressbar.visibility = View.VISIBLE
                contactViewModel.apiRequest(Enums.REQ_CONTACT_LIST,requireContext())
                page++
               }
            }
        })

        binding.searchEt.addTextChangedListener(EditTextTextWatcher(binding.searchEt))
    }

    override fun onSuccessResponse(jsonResponse: LiveData<Any>, requestCode: Int) {

        Log.e("response",jsonResponse.value.toString())

        when (requestCode) {

            Enums.REQ_CONTACT_LIST ->{

                    val gson = Gson()
                    val reader = JsonReader(StringReader(jsonResponse.value.toString()))
                    reader.isLenient = true // Set to false temporarily
                    try {
                        val datavalue = gson.toJson(jsonResponse.value)
                        val contactData: ContactData = gson.fromJson(datavalue, ContactData::class.java)
                        contactList.addAll(contactData.results)
                        OrgContactList.addAll(contactData.results)
                        contactListAdapter.notifyDataSetChanged()
                        binding.progressbar.visibility = View.GONE
                        commonMethods.hideProgressDialog()
                    } catch (e: JsonSyntaxException) {
                        e.printStackTrace()
                    }
            }
        }
    }

    inner class EditTextTextWatcher internal constructor(private val view: View?) : TextWatcher {
        override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
            val text=charSequence.toString()
        }
        override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
        @SuppressLint("SuspiciousIndentation")
        override fun afterTextChanged(editable: Editable) {
            val text=editable.toString()
            val filteredContacts = OrgContactList.filter {  it.name.first.contains(text, ignoreCase = true) }
            contactList.clear()
            contactList.addAll(filteredContacts)
            contactListAdapter.notifyDataSetChanged()
        }
    }

    override fun onFailureResponse(errorResponse: String, requestCode: Int) {
        Toast.makeText(requireContext(),errorResponse,Toast.LENGTH_LONG).show()
    }

    override fun itemClick(position: Int, details : Boolean) {
        if(details){
            val bundle = Bundle()
            bundle.putBoolean("random",true)
            bundle.putSerializable("data",contactList.get(position))
            findNavController().navigate(R.id.action_randromContactFragment_to_contactDetailsFragment,bundle)
        }else
            checkphoneCallPermission(position)
    }

    private fun checkphoneCallPermission(position: Int){
        this.position = position
        if (ContextCompat.checkSelfPermission(requireContext(),android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(requireActivity(), arrayOf(android.Manifest.permission.CALL_PHONE),
                REQUEST_CODE)

        } else {
            makePhoneCall(contactList.get(position).phone)
        }
    }

    private fun makePhoneCall(phoneNumber : String){
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber))
        startActivity(intent)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if(requestCode == REQUEST_CODE){
            if(grantResults.size>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                makePhoneCall(contactList.get(position).phone)
            }else{
                Toast.makeText(requireContext(),"Phone call permission denied,Please allow permission to make a call",Toast.LENGTH_LONG).show()
            }
        }
    }
}