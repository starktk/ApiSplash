package com.example.lp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.components.Extentions
import com.example.fundatecti21.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val extention = Extentions(context = this)

        extention.toast
        extention.snackbar

    }
}