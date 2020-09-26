package com.hcf.head.first.design.pattern.chapter04.pizza.impl;

import com.hcf.head.first.design.pattern.chapter04.pizza.Pizza;

public class PepperonPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("PepperonPizza:prepare");
    }

    @Override
    public void bake() {
        System.out.println("PepperonPizza:bake");
    }

    @Override
    public void cut() {
        System.out.println("PepperonPizza:cut");
    }

    @Override
    public void box() {
        System.out.println("PepperonPizza:box");
    }
}
