package com.hcf.head.first.design.pattern.chapter07.duck.impl;

import com.hcf.head.first.design.pattern.chapter07.duck.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("呱呱呱");
    }

    @Override
    public void fly() {
        System.out.println("鸭子飞");
    }
}
