package com.hcf.head.first.design.pattern.chapter12.adapter;

import com.hcf.head.first.design.pattern.chapter12.goose.Goose;
import com.hcf.head.first.design.pattern.chapter12.observer.Observable;
import com.hcf.head.first.design.pattern.chapter12.observer.Observer;
import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;


public class GooseAdapter implements Quackable {
    private Goose goose;

    private Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }


    @Override
    public void quack() {
        goose.honk();
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
