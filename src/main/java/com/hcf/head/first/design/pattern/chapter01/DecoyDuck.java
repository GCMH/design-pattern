package com.hcf.head.first.design.pattern.chapter01;

public class DecoyDuck extends Duck {
    @Override
    protected void display() {
        System.out.println("诱饵鸭");
    }

    @Override
    protected void quack() {
        //诱饵鸭不会叫
    }

    @Override
    protected void fly() {
        //诱饵鸭不会飞
    }
}
