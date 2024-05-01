package com.example.contact

import android.content.res.Configuration
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

open class CommonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    companion object {
       /* private var BLUE = R.style.AppTheme_MainTheme
        private var RED_DIALOG = R.style.DialogTheme_Main
        private var FONT = R.style.font_1
        var currentTheme = BLUE
        var currentDilogTheme = RED_DIALOG
        var currentFont = FONT

        fun isDarkTheme(resources: Resources): Boolean {
            return resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES
        }*/
    }
}