package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testar: Button = findViewById(R.id.btnTestar)
        testar.setOnClickListener{analisarNumeros()}
    }

    private fun analisarNumeros(){
        val v1 = findViewById<EditText>(R.id.valor1).text.toString()
        val v2 = findViewById<EditText>(R.id.valor2).text.toString()



        try {
            val valor1 = v1.toFloat()
            val valor2 = v2.toFloat()

            if(valor1 == valor2) {
                Toast.makeText(
                    this, "Mesmos números!",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if(valor1 > valor2) {
                Toast.makeText(
                    this, "O primeiro número é maior!",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if(valor1 < valor2) {
                Toast.makeText(
                    this, "O segundo número é maior!",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
        catch(err: NumberFormatException) {
            Toast.makeText(
                this, "Números inválidos",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}