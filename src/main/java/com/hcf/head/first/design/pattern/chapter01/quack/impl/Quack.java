package com.hcf.head.first.design.pattern.chapter01.quack.impl;

import com.hcf.head.first.design.pattern.chapter01.quack.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
