package com.hcf.head.first.design.pattern.chapter02.WeatherData;

import com.hcf.head.first.design.pattern.chapter02.observer.Observer;
import com.hcf.head.first.design.pattern.chapter02.subject.Subject;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;

import java.util.LinkedList;
import java.util.List;

@Data
public class WeatherData implements Subject {

    private List<Observer> observerList;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observerList = new LinkedList<>();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (CollectionUtils.isEmpty(observerList)) {
            throw new IllegalArgumentException("没有观察者列表");
        }
        if (observerList.remove(observer)) {
            throw new IllegalArgumentException("移除失败");
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
