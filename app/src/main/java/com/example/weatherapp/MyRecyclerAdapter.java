package com.example.weatherapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>{
    private ArrayList<Weather> weathers;

    public MyRecyclerAdapter(ArrayList<Weather> weathers) {
        this.weathers = weathers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listElement = layoutInflater.inflate(R.layout.list_element, parent, false);
        ViewHolder viewHolder = new ViewHolder(listElement);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Weather weather = weathers.get(position);
        holder.textViewCity.setText(weather.getCity());
        holder.textViewWeekDay.setText(weather.getWeekDay().toString());
        holder.textViewMaxTemp.setText(String.valueOf(weather.getTemp_max()));
        holder.textViewMinTemp.setText(String.valueOf(weather.getTemp_min()));
        holder.textViewAverageTemp.setText(String.valueOf((weather.getTemp_min() + weather.getTemp_max())/2));
        holder.textViewClouds.setText(String.valueOf(weather.getClouds()));
    }

    @Override
    public int getItemCount() {
        return weathers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements onWeatherClickListener {
        public TextView textViewCity, textViewWeekDay, textViewMinTemp, textViewMaxTemp, textViewAverageTemp, textViewClouds;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textViewCity = itemView.findViewById(R.id.tv_city);
            this.textViewWeekDay = itemView.findViewById(R.id.tv_weekDay);
            this.textViewAverageTemp = itemView.findViewById(R.id.tv_averageTemp);
            this.textViewClouds = itemView.findViewById(R.id.tv_clouds);
            this.textViewMinTemp = itemView.findViewById(R.id.tv_minTemp);
            this.textViewMaxTemp = itemView.findViewById(R.id.tv_maxTemp);
        }

        @Override
        public void onWeatherClick(View view, int position) {
        }
    }

    public interface onWeatherClickListener {
        void onWeatherClick(View view, int position);
    }
}

