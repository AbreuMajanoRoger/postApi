package com.example.postapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.postapi.adapter.PostAdapter
import com.example.postapi.data.ResultPost
import com.example.postapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
   lateinit var adapter: PostAdapter
    lateinit var postList: List<ResultPost>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       
       binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)

        postList = emptyList()

        //adapter = PostAdapter(postList) { position -> navigateToDetail(postList[position]) }
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(this)


   }
}