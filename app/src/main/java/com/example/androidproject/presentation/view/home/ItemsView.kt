package com.example.androidproject.presentation.view.home

import com.example.androidproject.domain.model.ItemsModel

interface ItemsView {

    fun itemsReceived(itemsList: List<ItemsModel>)

    fun imageViewClicked(msg: Int)

    fun itemClicked(navigationData: NavigateWithBundle)
}