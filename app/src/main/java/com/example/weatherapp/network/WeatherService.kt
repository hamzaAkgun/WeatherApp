package com.example.weatherapp.network

import com.example.weatherapp.models.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherService {


    @GET("data/2.5/weather")
    suspend fun getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String?,
        @Query("appid") appid: String?
    ) : Response<WeatherResponse>
}