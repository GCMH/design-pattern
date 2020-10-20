package com.hcf.head.first.design.pattern.chapter12.observer;


public interface QuackObverser {

    void registerObserver(Observer observer);

    void notifyObservers();
}
