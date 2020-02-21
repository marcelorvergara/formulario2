package com.example.formulario

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_img_select.*

class imgSelect : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img_select)

        var meuinttReult = Intent()


        setResult(Activity.RESULT_OK,meuinttReult)

        imgAvatar1.setOnClickListener() {
            meuinttReult.putExtra(
                "resultado",
                "Avatar1")
            finish()
        }
        imgAvatar2.setOnClickListener() {
            meuinttReult.putExtra(
                "resultado",
                "Avatar2")
            finish()
        }
        imgAvatar3.setOnClickListener() {
            meuinttReult.putExtra(
                "resultado",
                "Avatar3")
            finish()
        }
        imgAvatar4.setOnClickListener() {
            meuinttReult.putExtra(
                "resultado",
                "Avatar4")
            finish()
        }
        imgAvatar5.setOnClickListener() {
            meuinttReult.putExtra(
                "resultado",
                "Avatar5")
            finish()
        }
        imgAvatar6.setOnClickListener() {
            meuinttReult.putExtra(
                "resultado",
                "Avatar6")
            finish()
        }
        imgAvatar7.setOnClickListener() {
            meuinttReult.putExtra(
                "resultado",
                "Avatar7")
            finish()
        }
        imgAvatar8.setOnClickListener() {
            meuinttReult.putExtra(
                "resultado",
                "Avatar8")
            finish()
        }
    }
}
