package com.example.app_dec

import android.content.AttributionSource
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet

class MainActivity : AppCompatActivity() { // internal в начале делает класс видимым внутри модуля
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val field = 5

    }
}

//TODO : class Test constructor( val vali: Int, var vari: Int){}
//TODO : val = неизменяемое , var = изменяемое

open class Test(){ // нельзя наследоваться не от open класса

    protected open val protString = "" // делаем полу публичным у наследника

    constructor(field: String):this()
    constructor(field: String,field2: String):this(field)
    constructor(field: String,field2: String, field3:String):this(field,field2)

    private lateinit var vali:String
    fun name(){
        vali = "значение"
    }
}

class NewTest(field: String,field2: String):Test(field,field2){ // наследование

    public override val protString:String="" // делаем полу публичным у наследника

    var newField:String = " " // создаём новое, помимо наследования, private просто так


        get(){
            return "$newField get"
    }
        set(value){
            field = "$value set"
    } // это всё доступ к свойству как к полю


    init{
        newField = " "
    }
}

