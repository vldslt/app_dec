package com.example.app_dec

import android.content.AttributionSource
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val field1 = 5
        var field2 = 5

        field2 = 235

        val test = Test(1,2) // задаём объект

        val newi = test.vali // геттер, нет сеттера тк это val = изминяемая (вернули)
        test.vari = newi // сеттер (присвоили)

    }
}

//TODO : class Test constructor( val vali: Int, var vari: Int){}
//TODO : val = неизменяемое , var = изменяемое

/*
class Test constructor(){
    lateinit var vali:String
    fun name():String{
        return vali
    }
}
*/
