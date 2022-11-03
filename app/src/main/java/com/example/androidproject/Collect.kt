package com.example.androidproject

class Collect {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            //ummutable collection
            val collectionList = listOf<String>(
                "hello",
                "bye",
                "world"
            )
            //collectionList.add() we can't to so


            //mutable collection
            var collectionList2 = mutableListOf<String>()
            collectionList2.add("hello")
            collectionList2.add("bye")
            collectionList2.add("world")

            collectionList2.forEach { word ->
                //print(it) можно так
                print("$word ")
            }

            println()

            for (i in 1..collectionList.size) {
                println(i)
            }

            val arrayList = arrayListOf<String>(
                "hello",
                "go",
                "WORLD"
            )

            for (world in arrayList) {
                println(world)
            }

            println()

            for (i in 10 downTo 1 step 2){
                println("$i")
            }

            println("_______________________")

            for(i in 1 .. 10){//ставим Hello World! на 1 индекс
                if (i == 2){
                    println("Hello World!")
                    continue
                }
                println(i)
            }

            println("\n")

            val collect = Collect()//вызов функции через repeat 10 раз
            repeat(10){
                println(collect.getName())
            }
        }
    }

    fun getName(): String{
        return "Hello!!!!!"
    }
}