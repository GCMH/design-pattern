package com.hcf.head.first.design.pattern.chapter01.duck.sub;

import com.hcf.head.first.design.pattern.chapter01.duck.Duck;
import com.hcf.head.first.design.pattern.chapter01.fly.impl.FlyNoWay;
import com.hcf.head.first.design.pattern.chapter01.quack.impl.Quack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("诱饵鸭");
    }

}
