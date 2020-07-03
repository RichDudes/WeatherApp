package com.example.weatherapp;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("weather/realtime")
    Call<Weather> getWeather(
            @Query("lat") Double lat,
            @Query("lon") Double lon,
            @HeaderMap Map<String, String> headers
    );
}
