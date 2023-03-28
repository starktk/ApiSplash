package com.example.fundatecti21.presentation

import android.text.Editable
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val inserirNome = MutableLiveData<String>()
    val name: LiveData<String> = inserirNome

    private val visibilidade = MutableLiveData<Int>()
    val visibility: LiveData<Int> = visibilidade

    private val notificacao = MutableLiveData<Unit>()
    val mostrarNotf: LiveData<Unit> = notificacao

    fun validarNome(text: Editable) {
        val meuText = text.toString()
        if (!meuText.isNullOrBlank()) {
            inserirNome.value = meuText
            visibilidade.value = View.VISIBLE
        } else {
            notificacao.value = Unit
        }

    }

    fun clear() {
        inserirNome.value = ""
        visibilidade.value = View.GONE
    }

}