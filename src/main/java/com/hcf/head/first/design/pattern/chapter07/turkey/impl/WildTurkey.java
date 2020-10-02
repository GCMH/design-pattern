package com.hcf.head.first.design.pattern.chapter07.turkey.impl;

import com.hcf.head.first.design.pattern.chapter07.turkey.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("咯咯咯");
    }

    @Override
    public void fly() {
        System.out.println("火鸡飞");
    }
}
