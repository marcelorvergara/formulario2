package com.example.formulario

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.formulario.Model.Usuario
import kotlinx.android.synthetic.main.activity_novoformulario.*
import java.util.*

class novoFormulario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novoformulario)

        var valores = intent.getSerializableExtra("user") as Usuario


        txtVwNome.text = valores.nome.toUpperCase(Locale.FRENCH)
        txtVwEmail.text = valores.email.toUpperCase(Locale.FRENCH)
        txtVwPhone.text = valores.telefone.toUpperCase(Locale.FRENCH)

        var nome = txtVwNome.text.toString()
        var email = txtVwEmail.text.toString()
        var phone = txtVwPhone.text.toString()

        //Toast.makeText(this, "Nome: $nome", Toast.LENGTH_SHORT).show()

        //retornando para o primeiro formulario
        var usuario = Usuario("$nome","$email","$phone")
        var meuinttReult = Intent()
        meuinttReult.putExtra(
            "caixaMaior",
            usuario)

        setResult(Activity.RESULT_OK,meuinttReult)

        bntVoltar.setOnClickListener() {
            finish()
        }
    }
}
