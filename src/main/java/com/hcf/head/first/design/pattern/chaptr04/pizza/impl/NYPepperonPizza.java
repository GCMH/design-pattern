package com.hcf.head.first.design.pattern.chaptr04.pizza.impl;

import com.hcf.head.first.design.pattern.chaptr04.pizza.Pizza;

public class NYPepperonPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("NYPepperonPizza:prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYPepperonPizza:bake");
    }

    @Override
    public void cut() {
        System.out.println("NYPepperonPizza:cut");
    }

    @Override
    public void box() {
        System.out.println("NYPepperonPizza:box");
    }
}
