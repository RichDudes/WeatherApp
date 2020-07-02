package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    TextView textView;
    MainContract.Presenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        mPresenter = new MainPresenter(this);
        mPresenter.requestWeathers();

    }

    @Override
    public void showWeathers(ArrayList<Weather> weathers) {
        Weather w = weathers.get(0);
        textView.setText(w.getCity());
    }
}