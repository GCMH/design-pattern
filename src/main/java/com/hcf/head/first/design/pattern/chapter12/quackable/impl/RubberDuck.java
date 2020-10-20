package com.hcf.head.first.design.pattern.chapter12.quackable.impl;

import com.hcf.head.first.design.pattern.chapter12.observer.Observable;
import com.hcf.head.first.design.pattern.chapter12.observer.Observer;
import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;


public class RubberDuck implements Quackable {

    private Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
