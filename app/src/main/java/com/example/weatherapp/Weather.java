package com.example.weatherapp;

public class Weather {
    private String city;
    public enum WeekDay {
        MONDAY("Monday"),
        TUESDAY("Tuesday"),
        WEDNESDAY("Wednesday"),
        THURSDAY("Thursday"),
        FRIDAY("Friday"),
        SATURDAY("Saturday"),
        SUNDAY("Sunday");

        private String currentDay;

        WeekDay(String day){
            currentDay = day;
        }

        public String toString() {
            return currentDay;
        }
    }

    private WeekDay weekDay;
    private double temp_min;
    private double temp_max;
    private int clouds;

    public Weather(String city, WeekDay weekDay, double temp_min, double temp_max, int clouds) {

        this.city = city;
        this.weekDay = weekDay;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.clouds = clouds;
    }

}