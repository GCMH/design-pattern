package com.hcf.head.first.design.pattern.chapter12;

import com.hcf.head.first.design.pattern.chapter12.observer.Observer;
import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;

public class QuackCount implements Quackable {
    private Quackable duck;

    private static Integer count = 0;



    public QuackCount(Quackable duck) {
        this.duck = duck;

    }

    @Override
    public void quack() {
        duck.quack();
        count++;
    }

    public static Integer getCount() {
        return count;
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
