package com.hcf.head.first.design.pattern.chapter02;

import com.hcf.head.first.design.pattern.chapter02.WeatherData.WeatherData;
import com.hcf.head.first.design.pattern.chapter02.display.impl.CurrentConditionDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(1,2,3);
        weatherData.setMeasurements(2,4,6);
    }
}
