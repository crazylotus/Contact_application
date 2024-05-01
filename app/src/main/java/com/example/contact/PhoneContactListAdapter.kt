package com.example.contact

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.contact.datamodel.ContactsModal


class PhoneContactListAdapter(private val context: Context, contactsModalArrayList: ArrayList<ContactsModal>, private val listener : ItemOnClickListener ) : RecyclerView.Adapter<PhoneContactListAdapter.ViewHolder>() {
    private var contactsModalArrayList: ArrayList<ContactsModal>

    init {
        this.contactsModalArrayList = contactsModalArrayList
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder( LayoutInflater.from(context).inflate(R.layout.contact_view, parent, false) )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val modal: ContactsModal = contactsModalArrayList[position]
        holder.contactTV.text = modal.userName


        if(isValidName(modal.userName?.get(0).toString())){
            val tileImg  = modal.userName?.get(0)?.let { TextDrawable(context, it.toString()) }
            holder.image.setImageDrawable(tileImg)
            holder.cardView.setBackgroundColor(getRandomColor())
        }

        holder.cardView.visibility = View.VISIBLE
        holder.contactIV.visibility = View.GONE


        holder.detailsLayout.setOnClickListener {
            listener.itemClick(position,true)
        }

        holder.ivCall.setOnClickListener {
            listener.itemClick(position,false)
        }
    }

    interface ItemOnClickListener{
        fun itemClick(position: Int,details : Boolean)
    }

    override fun getItemCount(): Int {
        return contactsModalArrayList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactIV: ImageView
        val contactTV: TextView
        val image : ImageView
        val ivCall : ImageView
        val cardView : CardView
        val detailsLayout : LinearLayout

        init {

            contactIV = itemView.findViewById<ImageView>(R.id.contact_iv)
            contactTV = itemView.findViewById<TextView>(R.id.tv_first_name)
            image = itemView.findViewById(R.id.phone_iv)
            ivCall = itemView.findViewById(R.id.iv_call)
            cardView = itemView.findViewById(R.id.profile_cv)
            detailsLayout = itemView.findViewById(R.id.llt_details)
        }
    }

    inner class TextDrawable(private val context: Context, private val text: String) : Drawable() {

        private val paint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
        private val textBounds: Rect = Rect()

        init {
            paint.color = Color.BLACK
            paint.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                40f,
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

    private fun isValidName(name: String): Boolean {
        val regex = Regex("^[a-zA-Z][a-zA-Z0-9\\s]*$")
        return regex.matches(name)
    }
}