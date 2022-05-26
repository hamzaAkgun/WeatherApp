package com.example.weatherapp.models

import java.io.Serializable

data class Sys(
    val country: String,
    val id: Int,
    val message: String,
    val sunrise: Long,
    val sunset: Long,
    val type: Int
) : Serializable