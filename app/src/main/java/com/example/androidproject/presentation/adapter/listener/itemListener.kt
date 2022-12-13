package com.example.androidproject.presentation.adapter.listener

interface itemListener {

    fun onClick()

    fun onElementSelected(name: String, date: String, imageView: Int)
}