package com.example.fundatecti21

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fundatecti21.presentation.LoginViewModel

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginprincipal)

        val LoginView = LoginViewModel()



    }
}