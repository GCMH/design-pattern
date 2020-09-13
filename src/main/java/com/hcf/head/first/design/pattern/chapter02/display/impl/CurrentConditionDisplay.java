package com.hcf.head.first.design.pattern.chapter02.display.impl;

import com.hcf.head.first.design.pattern.chapter02.display.DisplayElement;
import com.hcf.head.first.design.pattern.chapter02.observer.Observer;
import com.hcf.head.first.design.pattern.chapter02.subject.Subject;
import lombok.Data;

@Data
public class CurrentConditionDisplay implements DisplayElement, Observer {

    private Subject subject;

    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
