package com.hcf.head.first.design.pattern.chapter02.subject;

import com.hcf.head.first.design.pattern.chapter02.observer.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
