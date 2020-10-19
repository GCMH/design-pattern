package com.hcf.head.first.design.pattern.chapter12.factory;

import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;

public interface AbstractFactory {
    Quackable createRedheadDuck();
    Quackable createDuckCall();
    Quackable createRubberDuck();
    Quackable createMallarDuck();
}
