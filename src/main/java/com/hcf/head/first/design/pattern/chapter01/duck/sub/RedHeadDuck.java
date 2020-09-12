package com.hcf.head.first.design.pattern.chapter01.duck.sub;

import com.hcf.head.first.design.pattern.chapter01.duck.Duck;
import com.hcf.head.first.design.pattern.chapter01.fly.impl.FlyWithWings;
import com.hcf.head.first.design.pattern.chapter01.quack.impl.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("红头鸭子");
    }
}
