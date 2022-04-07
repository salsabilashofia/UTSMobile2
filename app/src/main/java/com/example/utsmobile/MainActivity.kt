package com.example.utsmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

data class siput1 (
    var siput: String = "",
    var ilmiah: String = "",
    var penjelasanSingkat: String = "",
    var fotoSiput: Int = 0
)

class MainActivity : AppCompatActivity() {
    private var list: ArrayList<siput1> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainsiput.setHasFixedSize(true)

        list.addAll(DataSiput.listData)

        mainsiput.layoutManager = LinearLayoutManager(this)
        val listSiputAdapter = AdapterList(list)
        mainsiput.adapter = listSiputAdapter

    }
}