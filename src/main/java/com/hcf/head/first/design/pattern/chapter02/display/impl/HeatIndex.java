package com.hcf.head.first.design.pattern.chapter02.display.impl;

import com.hcf.head.first.design.pattern.chapter02.WeatherData.WeatherData;
import com.hcf.head.first.design.pattern.chapter02.display.DisplayElement;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

@Data
public class HeatIndex implements DisplayElement, Observer {

    private Observable subject;

    private float temperature;
    private float humidity;
    private float pressure;

    private float heatIndex;

    public HeatIndex(Observable subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "HeatIndex{" +
                heatIndex +
                '}';
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;

        this.heatIndex = weatherData.getTemperature() / 2 +
                weatherData.getHumidity() + 1 +
                weatherData.getTemperature() - 1;
        display();
    }
}
