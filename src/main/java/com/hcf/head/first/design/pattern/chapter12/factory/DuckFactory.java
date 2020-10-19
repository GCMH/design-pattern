package com.hcf.head.first.design.pattern.chapter12.factory;

import com.hcf.head.first.design.pattern.chapter12.QuackCount;
import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;
import com.hcf.head.first.design.pattern.chapter12.quackable.impl.DuckCall;
import com.hcf.head.first.design.pattern.chapter12.quackable.impl.MallarDuck;
import com.hcf.head.first.design.pattern.chapter12.quackable.impl.RedheadDuck;
import com.hcf.head.first.design.pattern.chapter12.quackable.impl.RubberDuck;

public class DuckFactory implements AbstractFactory{
    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createMallarDuck() {
        return new MallarDuck();
    }
}
