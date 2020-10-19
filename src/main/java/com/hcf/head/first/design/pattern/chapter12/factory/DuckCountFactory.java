package com.hcf.head.first.design.pattern.chapter12.factory;

import com.hcf.head.first.design.pattern.chapter12.QuackCount;
import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;
import com.hcf.head.first.design.pattern.chapter12.quackable.impl.DuckCall;
import com.hcf.head.first.design.pattern.chapter12.quackable.impl.MallarDuck;
import com.hcf.head.first.design.pattern.chapter12.quackable.impl.RedheadDuck;
import com.hcf.head.first.design.pattern.chapter12.quackable.impl.RubberDuck;

public class DuckCountFactory implements AbstractFactory {
    @Override
    public Quackable createRedheadDuck() {
        return new QuackCount(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCount(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCount(new RubberDuck());
    }

    @Override
    public Quackable createMallarDuck() {
        return new QuackCount(new MallarDuck());
    }
}
