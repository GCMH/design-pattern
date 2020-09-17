package com.hcf.head.first.design.pattern.chapter03.condiment;

import com.hcf.head.first.design.pattern.chapter03.beverage.Beverage;

import java.math.BigDecimal;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this();
        this.beverage = beverage;
    }

    public Milk() {
        this.description = "milk ";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + this.description;
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(1).add(beverage.cost());
    }
}
