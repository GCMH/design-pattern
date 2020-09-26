package com.hcf.head.first.design.pattern.chapter04.pizza.impl;

import com.hcf.head.first.design.pattern.chapter04.pizza.Pizza;

public class ChicagoPepperonPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("ChicagoPepperonPizza:prepare");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoPepperonPizza:bake");
    }

    @Override
    public void cut() {
        System.out.println("ChicagoPepperonPizza:cut");
    }

    @Override
    public void box() {
        System.out.println("ChicagoPepperonPizza:box");
    }
}
