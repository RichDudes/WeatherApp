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
        holder.textViewCod.setText(String.valueOf(weather.getLat()));
        holder.textViewDescription.setText(String.valueOf(weather.getLon()));
    }

    @Override
    public int getItemCount() {
        return weathers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements onWeatherClickListener {
        public TextView textViewCod, textViewDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textViewCod = itemView.findViewById(R.id.tv_cod);
            this.textViewDescription = itemView.findViewById(R.id.tv_description);
        }

        @Override
        public void onWeatherClick(View view, int position) {
        }
    }

    public interface onWeatherClickListener {
        void onWeatherClick(View view, int position);
    }
}

