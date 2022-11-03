package com.example.androidproject

private const val ZERO_TO_FOUR = 0

fun outerFun(){
    print("I'm an outer fun")
}

class Lesson15 {

    val country = "Belarus"
    var city = "Minsk"
    lateinit var adress: String

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val kotlinClass = KotlinClass("Gleb", 55)
            val kotlinClass2 = KotlinClass("country", "city", "address")
            println("${kotlinClass2.city} ${kotlinClass2.country} ${kotlinClass2.address}")

            val string = kotlinClass.getNameAndAge()
            println(string)

            val lesson15 = Lesson15()
            lesson15.country
            lesson15.city = "Brest"
            lesson15.adress = "Tsimiryazeva 67"
            print("${lesson15.adress}")

            lesson15.returnBoolean()
            outerFun()// не нужно писать экземпляр, так как эта функция за классом(она static)
        }
    }
    //fun emptyFun(): Unit = print("I am an empty fun") - можно так
    fun emptyFun(): Unit{
        print("I am an empty fun")
    }

    fun returnBoolean(): Boolean = true
}

//val - нельзя поменять, var - можно

//val name: String, var age: Int - это свойство
class KotlinClass(val name: String, var age: Int): Parent(), Behavior {

    public var country: String = ""
    public var city: String = ""
    public var address: String = ""

    constructor() : this("", 1)

    constructor(country: String, city: String, adress: String) : this(){
        this.country = country
        this.city = city
        this.address = adress
    }

//    fun getNameAndAge(name: String): String { - это параметр
    fun getNameAndAge(): String {
        //return name + age
        return "$name $age"
    }

    override fun getHairColor() {
        super.getHairColor()
    }

    override fun getEyeColor() {
        TODO("Not yet implemented")
    }
}

open class Parent{

    open fun getHairColor(){

    }
}

interface Behavior{

    fun getEyeColor()
}