package com.example.fundatecti21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.fundatecti21.presentation.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = MainViewModel()

        val clean = findViewById<Button>(R.id.Limpar)
        val ok =  findViewById<Button>(R.id.Ok)
        val inserirNome = findViewById<EditText>(R.id.InserirNome)
        val mensagem = findViewById<TextView>(R.id.Mensagem)


        ok.setOnClickListener {
          viewModel.validarNome(inserirNome.text)
        }

        clean.setOnClickListener {

            viewModel.clear()
        }

        viewModel.visibility.observe(this) { visibility ->
            mensagem.visibility = visibility
        }

        viewModel.name.observe(this) { name ->
            mensagem.text = getString(R.string.qual_seu_nome, name)

        }

        viewModel.mostrarNotf.observe(this) {
            Toast.makeText(this, "Insira seu nome!!", Toast.LENGTH_LONG).show()
        }
    }
}