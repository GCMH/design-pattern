package com.hcf.head.first.design.pattern.chapter01.fly.impl;

import com.hcf.head.first.design.pattern.chapter01.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
