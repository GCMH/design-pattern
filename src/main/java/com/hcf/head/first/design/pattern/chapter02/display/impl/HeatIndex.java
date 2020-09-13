package com.hcf.head.first.design.pattern.chapter02.display.impl;

import com.hcf.head.first.design.pattern.chapter02.display.DisplayElement;
import com.hcf.head.first.design.pattern.chapter02.observer.Observer;
import com.hcf.head.first.design.pattern.chapter02.subject.Subject;
import lombok.Data;

@Data
public class HeatIndex implements DisplayElement, Observer {

    private Subject subject;

    private float temperature;
    private float humidity;
    private float pressure;

    private float heatIndex;

    public HeatIndex(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.heatIndex = temperature / 2 + humidity + 1 + temperature - 1;
        display();
    }

    @Override
    public String toString() {
        return "HeatIndex{" +
                heatIndex +
                '}';
    }
}
