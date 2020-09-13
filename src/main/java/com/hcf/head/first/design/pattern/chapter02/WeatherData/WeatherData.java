package com.hcf.head.first.design.pattern.chapter02.WeatherData;

import lombok.Data;

@Data
public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {

    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
