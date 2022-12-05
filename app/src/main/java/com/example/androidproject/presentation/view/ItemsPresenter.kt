package com.example.androidproject.presentation.view

import com.example.androidproject.R
import com.example.androidproject.domain.ItemsInteractor
import com.example.androidproject.model.ItemsModel

class ItemsPresenter(
    private val itemsView: ItemsView,
    private val itemsInteractor: ItemsInteractor,
) {


    fun getData() {
        val listItems = itemsInteractor.getData()
        itemsView.dataReceived(listItems)
    }

    fun imageViewClicked() {
        itemsView.imageViewClicked(R.string.iv_clicked)
    }

    fun elementSelected(name: String, date: String, imageView: Int) {
        itemsView.goToDetails(name, date, imageView)
    }
}