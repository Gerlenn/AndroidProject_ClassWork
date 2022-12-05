package com.example.androidproject.presentation.view

import com.example.androidproject.model.ItemsModel

interface ItemsView {

    fun dataReceived(list: List<ItemsModel>)

    fun imageViewClicked(ivClicked: Int)

    fun goToDetails(name: String, date: String, imageView: Int)
}