package com.example.androidproject.presentation.view.home

import com.example.androidproject.R
import com.example.androidproject.domain.items.ItemsInteractor
import javax.inject.Inject

class ItemsPresenter @Inject constructor(
    private val itemsInteractor: ItemsInteractor
) {

    private lateinit var itemsView: ItemsView

    fun setView(itemsFragment: ItemsFragment){
        itemsView = itemsFragment
    }

    fun getItems(){
        val items = itemsInteractor.getData()
        itemsView.itemsReceived(items)
    }

    fun imageViewClicked(){
        itemsView.imageViewClicked(R.string.image_view)
    }

    fun itemClicked(name: String, date: String, image: Int){
        itemsView.itemClicked(NavigateWithBundle(image = image,name = name, date = date))
    }
}

data class NavigateWithBundle(
    val image: Int,
    val name: String,
    val date: String,
)