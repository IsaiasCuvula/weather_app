package com.bersyte.weatherapp.api

import com.bersyte.weatherapp.model.Weather
import com.bersyte.weatherapp.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather/Luanda")
    suspend fun getWeather(): Response<Weather>

}