package com.example.weatherapp;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestController {
    private Retrofit mRetrofit;

    public RestController() {
        createRetrofit();
    }

    private void createRetrofit() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create()).build();
    }
}
