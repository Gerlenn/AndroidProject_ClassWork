package com.example.androidproject.presentation.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidproject.R
import com.example.androidproject.databinding.FragmentDetailsBinding
import com.example.androidproject.databinding.ItemFruitBinding
import com.example.androidproject.presentation.adapter.listener.itemListener
import com.example.androidproject.model.ItemsModel

class ItemsViewHolder(
    private val viewBinding: ItemFruitBinding,
    private val itemsListener: itemListener,
) : RecyclerView.ViewHolder(viewBinding.root) {

    fun bind(itemsModel: ItemsModel) {

        viewBinding.tvName.text = itemsModel.name
        viewBinding.image.setBackgroundResource(itemsModel.image)
        viewBinding.tvDate.text = itemsModel.date

        viewBinding.image.setOnClickListener {
            itemsListener.onClick()
        }

        itemView.setOnClickListener {
            itemsListener.onElementSelected(
                itemsModel.name,
                itemsModel.date,
                itemsModel.image,
            )
        }
    }
}