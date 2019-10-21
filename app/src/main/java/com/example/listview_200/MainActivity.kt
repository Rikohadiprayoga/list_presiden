package com.example.listview_200

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvPresiden: RecyclerView
    private var list: ArrayList<presiden> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPresiden = findViewById(R.id.rv_presiden)
        rvPresiden.setHasFixedSize(true)
        list.addAll(detail_presiden.list_presiden)
        showPresidenList()
    }

    private fun showPresidenList(){
        rvPresiden.layoutManager = LinearLayoutManager(this)
        val List_presiden = list_presiden(list)
        rvPresiden.adapter = List_presiden
    }
}
