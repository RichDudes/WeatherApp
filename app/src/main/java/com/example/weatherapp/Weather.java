package com.example.weatherapp;

import com.google.gson.annotations.SerializedName;

public class Weather {
    @SerializedName("lat")
    double lat;
    @SerializedName("lo0n")
    double lon;
    private Precipitation precipitation;
    private ObservationTime observationTime;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}

class Precipitation {
    int value;
    String units;
}
class ObservationTime {

}