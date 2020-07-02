package com.example.weatherapp;

import java.util.ArrayList;

public interface MainContract {
    interface View {
        void showWeathers(ArrayList<Weather> weathers);
    }
    interface Presenter {
        void requestWeathers();
    }
}
