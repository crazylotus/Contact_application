package com.example.contact

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.ConnectivityManager
import android.net.Uri
import android.provider.Settings
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONObject


class CommonMethods {

    internal var mProgressDialog: Dialog? = null


    fun hideProgressDialog() {

        if (mProgressDialog != null && mProgressDialog!!.isShowing()) {
            mProgressDialog?.dismiss()
        }
    }


    fun showProgressDialog(context: Context) {
        try {
            mProgressDialog = getDialog(context, R.layout.app_loader_view)
            mProgressDialog!!.setCancelable(false)
            mProgressDialog!!.setCanceledOnTouchOutside(false)
            mProgressDialog!!.setOnKeyListener(DialogInterface.OnKeyListener { dialog, keyCode, event -> keyCode == KeyEvent.KEYCODE_BACK })
            if (!mProgressDialog!!.isShowing) {
                try {
                    mProgressDialog?.show()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getDialog(mContext: Context, mLayout: Int): Dialog {
        val mDialog = Dialog(mContext)
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        mDialog.window!!.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN or WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        mDialog.setContentView(mLayout)
        mDialog.window!!.setBackgroundDrawable(
            ColorDrawable(Color.TRANSPARENT)
        )
        mDialog.window!!.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT
        )
        return mDialog
    }

}