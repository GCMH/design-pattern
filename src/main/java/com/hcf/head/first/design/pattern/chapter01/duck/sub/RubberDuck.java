package com.hcf.head.first.design.pattern.chapter01.duck.sub;

import com.hcf.head.first.design.pattern.chapter01.duck.Duck;
import com.hcf.head.first.design.pattern.chapter01.fly.impl.FlyNoWay;
import com.hcf.head.first.design.pattern.chapter01.quack.impl.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("橡皮鸭子");
    }

}
