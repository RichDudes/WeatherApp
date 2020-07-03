package com.example.weatherapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements MainContract.Presenter {

    MainContract.View view;
    Map<String, String> headers = new HashMap<>();

    ArrayList<Weather> weathers = new ArrayList<>();

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    public void requestWeathers() {
        headers.put("x-rapidapi-host", "climacell-microweather-v1.p.rapidapi.com");
        headers.put("x-rapidapi-key", "c149dce680msh0081e314590671fp18c9cfjsn91b51fca658d");

        RestController controller = new RestController();
        controller.provideWeatherApi().getWeather(42.8237618, -71.2216286, headers).enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                weathers.add(response.body());
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {

            }
        });

        view.showWeathers(weathers);
    }
}
