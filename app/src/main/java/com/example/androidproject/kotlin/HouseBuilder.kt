package com.example.androidproject.kotlin

class HouseBuilder(val builder: Builder) {

    fun hasSwimpool() = builder.swimpool//проверка есть ли бассейн (Возвращаем)

    fun howManyStrock() = builder.stock//сколько этажей(Возвращаем)

    companion object Builder{
        var stock: Int = 0
        var swimpool: Boolean = true

        fun setStrock(stock: Int) = apply {this.stock = stock}
        fun setSwimpool(swimpool: Boolean) = apply { this.swimpool =swimpool }

        fun build(): HouseBuilder{
            return HouseBuilder(this)
        }
    }
}