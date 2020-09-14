package com.hcf.head.first.design.pattern.chapter02.WeatherData;

import lombok.Data;

import java.util.Observable;

@Data
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
