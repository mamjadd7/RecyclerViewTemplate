package com.example.recyclerviewtemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewtemplate.customadapter.CustomAdapter
import com.example.recyclerviewtemplate.databinding.ActivityMainBinding
import com.example.recyclerviewtemplate.databinding.RvItemViewBinding
import com.example.recyclerviewtemplate.modal.Constant
import com.example.recyclerviewtemplate.modal.RvModal

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvAdapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = CustomAdapter(this, Constant.getData())






    }
}