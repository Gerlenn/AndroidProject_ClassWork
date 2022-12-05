package com.example.androidproject.data

import com.example.androidproject.R
import com.example.androidproject.domain.ItemsRepository
import com.example.androidproject.model.ItemsModel

class ItemsRepositoryImpl: ItemsRepository {

    override fun getData(): List<ItemsModel> {
        val listItems = listOf<ItemsModel>(
            ItemsModel(R.drawable.android,
                "Android",
                "23.12.2022"
            ),
            ItemsModel(R.drawable.swift,
                "IOS",
                "23.12.2022"
            ),
            ItemsModel(R.drawable.flutter,
                "Flutter",
                "23.12.2022"
            ),
            ItemsModel(R.drawable.pyth,
                "Python",
                "23.12.2022"
            ),
            ItemsModel(R.drawable.cplus,
                "C++",
                "23.12.2022"
            ),
            ItemsModel(R.drawable.c,
                "C",
                "23.12.2022"
            ),
            ItemsModel(R.drawable.ruby,
                "Ruby",
                "23.12.2022"
            ),
            ItemsModel(R.drawable.net,
                ".NET",
                "03.01.2018"
            ),
            ItemsModel(R.drawable.go,
                "Golang",
                "23.12.2030"
            ),
            ItemsModel(R.drawable.php,
                "PHP",
                "23.12.2008"
            ),
            ItemsModel(R.drawable.js,
                "JS",
                "20.09.2006"
            ),
            ItemsModel(R.drawable.fruit,
                "React",
                "23.12.1992"
            )
        )
        return listItems
    }
}