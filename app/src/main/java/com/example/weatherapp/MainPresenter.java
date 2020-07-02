package com.example.weatherapp;

public class MainPresenter implements MainContract.Presenter {
    MainContract.View view;
    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    public void showList() {

    }
}
