package com.hcf.head.first.design.pattern.chapter12.quackable.impl;

import com.hcf.head.first.design.pattern.chapter12.observer.Observable;
import com.hcf.head.first.design.pattern.chapter12.observer.Observer;
import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;


public class RedheadDuck implements Quackable {

    private Observable observable;

    public RedheadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Redhead duck quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
