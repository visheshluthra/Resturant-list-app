package com.example.restaurantadvisor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantadvisor.view.ViewModel.restrauntViewModel
import com.example.restaurantadvisor.view.restrauntAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter:RecyclerView.Adapter<*>
    private lateinit var viewModel: restrauntViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.restaurant)
        viewModel = ViewModelProvider(this).get(restrauntViewModel::class.java)
        viewModel.restrauntListLivedata.observe(this){
            it?.let {
                newRestrauList->
                adapter = restrauntAdapter(newRestrauList)
                recyclerView.adapter= adapter
                recyclerView.layoutManager = LinearLayoutManager(this)
            }
        }
         viewModel.populatedata()


    }
}