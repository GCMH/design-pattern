package com.hcf.head.first.design.pattern.chaptr04.pizza.impl;

import com.hcf.head.first.design.pattern.chaptr04.pizza.Pizza;

public class ChicagoCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoCheesePizza:prepare");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoCheesePizza:bake");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoCheesePizza:cut");
    }

    @Override
    public void box() {
        System.out.println("ChicagoCheesePizza:box");
    }
}
