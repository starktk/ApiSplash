package com.example.lp4


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fundatecti21.R


class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginprincipal)



        val email = findViewById<EditText>(R.id.Email)
        val senha = findViewById<EditText>(R.id.Senha)
        val cadastro = findViewById<TextView>(R.id.QuestionCadastro)
        val logar = findViewById<Button>(R.id.Logar)

        logar.setOnClickListener {
            val log = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(log)
        }
        cadastro.setOnClickListener{
            val cad = Intent(this@LoginActivity, CadastroActivity::class.java)
            startActivity(cad)
        }
    }
}