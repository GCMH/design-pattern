package com.hcf.head.first.design.pattern.chapter03.condiment;

import com.hcf.head.first.design.pattern.chapter03.beverage.Beverage;

import java.math.BigDecimal;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this();
        this.beverage = beverage;
    }

    public Soy() {
        this.description = "soy ";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + this.description;
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(2).add(beverage.cost());
    }
}
