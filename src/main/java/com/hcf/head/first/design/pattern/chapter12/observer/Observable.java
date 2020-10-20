package com.hcf.head.first.design.pattern.chapter12.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObverser {
    private QuackObverser quackObverser;
    private List<Observer> observers = new ArrayList<>();

    public Observable(QuackObverser quackObverser) {
        this.quackObverser = quackObverser;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterable = observers.iterator();
        while (iterable.hasNext()) {
            iterable.next().update(null, quackObverser);
        }
    }
}
