package com.hcf.head.first.design.pattern.chapter12.observer;

public class QuackLogist implements Observer {
    @Override
    public void update(Observable observable, Object obj) {
        System.out.println("观察到：" + obj);
    }
}
