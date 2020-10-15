package com.lnsantos.singleselectedexemple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.lnsantos.singleselectedexemple.adapter.MainAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var adapter : MainAdapter
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler = findViewById(R.id.recycler)
        recycler.adapter = MainAdapter(resources)
    }
}