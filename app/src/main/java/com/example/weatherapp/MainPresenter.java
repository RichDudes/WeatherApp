package com.example.weatherapp;

import java.util.ArrayList;

public class MainPresenter implements MainContract.Presenter {

    MainContract.View view;
    ArrayList<Weather> weathers = new ArrayList<>();

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    public void requestWeathers() {
        Weather w1 = new Weather("Vinnytsia", Weather.WeekDay.MONDAY, 15.23, 28.5, 2);
        Weather w2 = new Weather("Zhytomyr", Weather.WeekDay.MONDAY, 16.34, 30.1, 1);
        Weather w3 = new Weather("Warsaw", Weather.WeekDay.MONDAY, 13.11, 25.7, 5);
        weathers.add(w1);
        weathers.add(w2);
        weathers.add(w3);
        view.showWeathers(weathers);
    }
}
