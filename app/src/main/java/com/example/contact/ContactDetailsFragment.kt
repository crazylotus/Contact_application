package com.example.contact

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.bumptech.glide.Glide
import com.example.contact.databinding.FragmentContactDetailsBinding
import com.example.contact.datamodel.ContactsModal
import com.example.contact.datamodel.Result


class ContactDetailsFragment : BindingFragment<FragmentContactDetailsBinding>() {

    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentContactDetailsBinding::inflate

    var random = true
    var phoneNumber = ""
    lateinit var editData : ContactsModal

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.iVBack.setOnClickListener {
            findNavController().popBackStack()
        }

        arguments?.apply {
            random = getBoolean("random")
            if(random){
                var data = getSerializable("data") as Result

               binding.idTVName.text = data.name.first
                binding.idTVPhone.text = data.phone
                binding.genderTv.text = data.gender
                binding.emailTv.text = data.email
                binding.iVEdit.visibility = View.GONE

                Glide.with(requireContext()).load(data.picture.large).into(binding.phoneIv)
                phoneNumber = data.phone

            }else{
                var data = getSerializable("data") as ContactsModal
                editData = data
                binding.idTVName.text = data.userName
                binding.idTVPhone.text = data.contactNumber
                phoneNumber = data.contactNumber!!
                binding.lltMoreDetails.visibility = View.GONE

                if(isValidName(data.userName?.get(0).toString())){
                    val tileImg  = data.userName?.get(0)?.let { TextDrawable(requireContext(), it.toString()) }
                    binding.phoneIv.setImageDrawable(tileImg)
                    binding.phoneIv.setBackgroundColor(getRandomColor())
                }

            }
        }

        binding.iVEdit.setOnClickListener {
            val bundle = Bundle()
            bundle.putBoolean("new",false)
            bundle.putSerializable("data",editData)
            findNavController().navigate(R.id.action_contactDetailsFragment_to_addOrEditContactFragment,bundle)
        }

        binding.idIVCall.setOnClickListener {
            makeCall(phoneNumber)
        }
        binding.idIVMessage.setOnClickListener {
            sendMessage(phoneNumber)
        }

    }

    private fun sendMessage(contactNumber: String) {
        // in this method we are calling an intent to send sms.
        // on below line we are passing our contact number.
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("sms:$contactNumber"))
        intent.putExtra("sms_body", "Enter your messaage")
        startActivity(intent)
    }

    private fun makeCall(contactNumber: String) {
        // this method is called for making a call.
        // on below line we are calling an intent to make a call.
        val callIntent = Intent(Intent.ACTION_CALL)
        // on below line we are setting data to it.
        callIntent.data = Uri.parse("tel:$contactNumber")
        // on below line we are checking if the calling permissions are granted not.
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                android.Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }
        // at last we are starting activity.
        startActivity(callIntent)
    }

    inner class TextDrawable(private val context: Context, private val text: String) : Drawable() {

        private val paint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
        private val textBounds: Rect = Rect()

        init {
            paint.color = Color.BLACK
            paint.textSize = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_SP,
                250f,
                context.resources.displayMetrics)
            paint.textAlign = Paint.Align.LEFT
            paint.getTextBounds(text, 0, text.length, textBounds)
        }

        override fun draw(canvas: Canvas) {
            val width = bounds.width().toFloat()
            val height = bounds.height().toFloat()

            val x = (width - textBounds.width()) / 2f - textBounds.left
            val y = height / 2f + textBounds.height() / 2f - textBounds.bottom

            canvas.drawText(text, x, y, paint)
        }

        override fun setAlpha(alpha: Int) {
            paint.alpha = alpha
            invalidateSelf()
        }

        override fun setColorFilter(colorFilter: android.graphics.ColorFilter?) {
            paint.colorFilter = colorFilter
            invalidateSelf()
        }

        override fun getOpacity(): Int {
            return paint.alpha
        }
    }

    private fun getRandomColor(): Int {
        val red = (200..255).random()
        val green = (200..255).random()
        val blue = (200..255).random()
        return Color.rgb(red, green, blue)
    }

    fun isValidName(name: String): Boolean {
        val regex = Regex("^[a-zA-Z][a-zA-Z0-9\\s]*$")
        return regex.matches(name)
    }

}