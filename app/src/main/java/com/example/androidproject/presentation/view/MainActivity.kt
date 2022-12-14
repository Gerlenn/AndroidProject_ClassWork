package com.example.androidproject.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidproject.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.activity_container, OnBoardingFragment())
        fragmentTransaction.commit()
    }
}