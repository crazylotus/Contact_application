package com.example.contact

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.contact.databinding.ContactViewBinding
import com.example.contact.datamodel.*

class ContactListAdapter(private val contactList : ArrayList<Result>,private val context: Context,private val listener : ContactListAdapter.ItemOnClickListener ) : RecyclerView.Adapter<ContactListAdapter.ViewHolder>() {

    class ViewHolder(val binding : ContactViewBinding) : RecyclerView.ViewHolder(binding.root)  {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ContactViewBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
        )
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contactList[position]
        val holder = holder.binding
        holder.tvFirstName.text = contact.name.first
        holder.tvSecondName.text = contact.name.last
        Glide.with(context).load(contact.picture.medium).into(holder.contactIv)

        holder.ivCall.setOnClickListener {
            listener.itemClick(position,false)
        }

        holder.lltDetails.setOnClickListener {
            listener.itemClick(position,true)
        }

    }

    interface ItemOnClickListener{
        fun itemClick(position: Int,details : Boolean)
    }
}