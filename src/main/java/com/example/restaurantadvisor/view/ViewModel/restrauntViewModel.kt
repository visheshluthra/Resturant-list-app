package com.example.restaurantadvisor.view.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.restaurantadvisor.model.restaurants

class restrauntViewModel:ViewModel() {

    val restrauntListLivedata = MutableLiveData<ArrayList<restaurants>>()

    fun populatedata(){
        val r1= restaurants("Durga Cafe","Atur Centre, Next to OSM, Model Colony, Shivajinagar, Pune","Chocolate Cold Coffee",4)
        val r2=restaurants("Eatsome","Atur Centre, Opposite OSM, Model Colony, Shivajinagr, Pune.","Non-veg Buttered Rice Combo",5)
        val r3=restaurants("Iceberg","Atur Centre, Opposite OSM, Model Colony, Shivajinagar, Pune","Oreo Shake",4)
        val r4= restaurants("Bourn Village","Atur Centre, Near OSM, Next to Dragon Chinese, Model Colony, Shivajinagar, Pune","Bournvita Shake",5)
        val r5= restaurants("Ganesh Paratha","Atur Centre, Near OSM, Next to Eatsome, Model Colony, Shivaginagar, Pune","Cheese Paneer Paratha",5)
        val r6=restaurants("Dragon Chinese","Atur Centre, Near OSM, Opposite Eatsome, Model Colony, Shivajinagar, Pune","Triple Rice Combo",4)
        val r7= restaurants("SymbiEat","SICSR, Atur Centre, Model Colony, Shivajinagar, Pune","Chicken Hakka Noodles",5)

        val res_list = ArrayList<restaurants>()
        res_list.add(r1)
        res_list.add(r2)
        res_list.add(r3)
        res_list.add(r4)
        res_list.add(r5)
        res_list.add(r6)
        res_list.add(r7)

        restrauntListLivedata.postValue(res_list)
    }
}