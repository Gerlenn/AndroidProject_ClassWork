package com.example.androidproject

import android.app.appsearch.BatchResultCallback
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.androidproject.kotlin.HouseBuilder

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val lambda = //так выглядит лямбда "String" не обязательно
            { string: String -> Toast.makeText(
                this, "your test is $string",
                Toast.LENGTH_SHORT).show()
            }
        lambda("Set text in lambda")

        makeRequest("https://google.com/"){ callbackResult ->//использовали лямбду и переименовали "it"
            Log.w("callBack result", callbackResult)//лог результата
        }

        val btn_my = findViewById<Button>(R.id.btn_my)

        val person = object {//это анонимный класс с именем и методом
            val name = "Gleb"
            fun develop(){
                Log.w("anonyme class", "call develop fun")
            }
        }

        val person2 = object: Developer {//имплементим интерфейс и переопределяем его метод
            val name = "Gleb"
            override fun develop() {//переопределяем метод интерфейса
                Log.w("anonyme class", "call develop fun DEVELOPER")
            }
        }

        val house = HouseBuilder.Builder
            .setStrock(3)
            .setSwimpool(false)
            .build()

        btn_my.setOnClickListener {
            Log.w("housebuilder", "${house.hasSwimpool()}  + ${house.howManyStrock()}")
            person.develop()//вызываем метод у анонимного класса
            person2.name
            person2.develop()
            callAnonymeClass(person2)//передаем анонимный объект с возвращаемым типом
            callAnonymeClass(object: Developer{//2 способ передачи объекта с возвращаемым типом
                override fun develop() {
                    Log.w("anonyme class", "call develop fun DEVELOPER(2)")
                }
            })
            Toast.makeText(this, person.name, Toast.LENGTH_SHORT).show()
        }

//        returnAnonymClass("String").develop()//можно использовать если returnAnonymClass(private)
    }

//    fun get(): String{//Возвращаемая функция(Способ 1)
//        return ""
//    }
    //   fun get2() = "" //Возвращаемая функция(Способ 2)

//создаём анонимный объект чтобы вернуть string, его(метод) можно использовать только в этом класс и нужно поставить идентификатор private
    fun returnAnonymClass(string: String)= object {
        fun develop(){
            Log.w("anonyme class", "call develop fun from returnType $string")
        }
    }



    fun callAnonymeClass(developer: Developer){//передаём объект Developer в метод
        developer.develop()
    }

    fun makeRequest(url: String, argForCallback: (string: String) -> Unit){
        argForCallback.invoke("callBackResult $url")
    }

    companion object {
        fun kotlinActivityStart(context: Context) {
            context.startActivity(Intent(context, KotlinActivity::class.java))
        }
    }
}

interface Developer{

    fun develop()
}