package com.hcf.head.first.design.pattern.chapter12.conponent;

import com.hcf.head.first.design.pattern.chapter12.observer.Observable;
import com.hcf.head.first.design.pattern.chapter12.observer.Observer;
import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> quackables = new ArrayList<>();

    private Observable observable;

    public Flock() {
        this.observable = new Observable(this);
    }

    public void add(Quackable quackable) {
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quackables.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
            notifyObservers();
        }
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


class B extends A {
    B() {
    }
}


class A {
    int x;
}
