package com.hcf.head.first.design.pattern.chaptr04.pizza.impl;

import com.hcf.head.first.design.pattern.chaptr04.pizza.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("CheesePizza:prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza:bake");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza:cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza:box");
    }
}
