package com.hcf.head.first.design.pattern.chapter03.beverage;

import lombok.Data;

import java.math.BigDecimal;

@Data
public abstract class Beverage {

    protected boolean milk;

    protected boolean soy;

    protected boolean mocha;

    protected boolean whip;

    protected String description;

    public BigDecimal cost() {
        BigDecimal cost = BigDecimal.ZERO;
        if (milk) {
            cost = cost.add(new BigDecimal(5));
        }
        if (soy) {
            cost = cost.add(new BigDecimal(4));
        }
        if (mocha) {
            cost = cost.add(new BigDecimal(3));
        }
        if (whip) {
            cost = cost.add(new BigDecimal(2));
        }
        return cost;
    }
}
