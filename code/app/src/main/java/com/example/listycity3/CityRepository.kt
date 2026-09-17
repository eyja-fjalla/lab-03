package com.example.listycity3

import androidx.compose.runtime.mutableStateListOf


class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )
    fun addCity(city: City){
        _cities.add(city)
    }
    fun updateCity(city: City, newName: String, newProvince: String ){
        val updatedCity = City(newName,newProvince)
        val index = _cities.indexOf(city)
        _cities[index] = updatedCity
    }
    val cities: List<City>
        get() = _cities
}