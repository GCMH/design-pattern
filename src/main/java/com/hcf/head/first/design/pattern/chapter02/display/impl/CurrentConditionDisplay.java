package com.hcf.head.first.design.pattern.chapter02.display.impl;

import com.hcf.head.first.design.pattern.chapter02.WeatherData.WeatherData;
import com.hcf.head.first.design.pattern.chapter02.display.DisplayElement;
import com.hcf.head.first.design.pattern.chapter02.subject.Subject;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

@Data
public class CurrentConditionDisplay implements DisplayElement, Observer {

    private Observable subject;

    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Observable subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;

        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }
}
