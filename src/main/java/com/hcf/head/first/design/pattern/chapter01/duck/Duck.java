package com.hcf.head.first.design.pattern.chapter01.duck;

import com.hcf.head.first.design.pattern.chapter01.fly.FlyBehavior;
import com.hcf.head.first.design.pattern.chapter01.quack.QuackBehavior;

public abstract class Duck {

    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;



    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("游泳");
    }

    public abstract void display();

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
