package com.example.androidproject

class HouseBuilder(val builder: Builder) {

    fun hasSwimpool() = swimpool//проверка есть ли бассейн (Возвращаем)

    fun howManyStrock() = stock//сколько этажей(Возвращаем)

    companion object Builder{
        var stock: Int = 0
        var swimpool: Boolean = true

        fun setStrock(stock: Int) = apply { Builder.stock = stock}
        fun setSwimpool(swimpool: Boolean) = apply { Builder.swimpool =swimpool }

        fun build(): HouseBuilder {
            return HouseBuilder(this)
        }
    }
}