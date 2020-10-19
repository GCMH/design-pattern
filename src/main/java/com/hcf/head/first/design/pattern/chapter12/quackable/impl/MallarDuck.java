package com.hcf.head.first.design.pattern.chapter12.quackable.impl;

import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;

public class MallarDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Mallar Duck quack");
    }
}
