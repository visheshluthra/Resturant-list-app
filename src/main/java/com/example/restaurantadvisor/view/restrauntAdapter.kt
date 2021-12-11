package com.example.restaurantadvisor.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantadvisor.R
import com.example.restaurantadvisor.model.restaurants


class restrauntAdapter(val restList:List<restaurants>):RecyclerView.Adapter<restrauntAdapter.restrauntViewholder>() {
    class restrauntViewholder(itemview:View):RecyclerView.ViewHolder(itemview){
        val R_name = itemview.findViewById<TextView>(R.id.textview10)
        val R_address = itemview.findViewById<TextView>(R.id.textview13)
        val R_speciality = itemview.findViewById<TextView>(R.id.textview12)
        val R_rating = itemview.findViewById<TextView>(R.id.textview11)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): restrauntViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.restaurantrow,parent,false)
        return restrauntViewholder(view)
    }

    override fun onBindViewHolder(holder: restrauntViewholder, position: Int) {
        holder.apply {
            R_name.text = restList[position].Name
            R_address.text = restList[position].Address
            R_speciality.text = restList[position].Speciality
            R_rating.text = restList[position].Rating.toString()
        }
    }

    override fun getItemCount(): Int {
        return restList.size
    }
}