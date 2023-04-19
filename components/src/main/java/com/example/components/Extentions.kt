package com.example.components

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class Extentions(context: Context?) : Toast (context) {


    val toast = Toast.makeText(context, "Uma mensagem ai", Toast.LENGTH_SHORT).show()
    val snackbar = Snackbar.make( View(context),"Outra mensagem ai", Snackbar.LENGTH_SHORT  )
}