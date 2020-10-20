package com.hcf.head.first.design.pattern.chapter12.quackable.impl;

import com.hcf.head.first.design.pattern.chapter12.observer.Observable;
import com.hcf.head.first.design.pattern.chapter12.observer.Observer;
import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;


public class MallarDuck implements Quackable {
    private Observable observable;

    public MallarDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Mallar Duck quack");
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
