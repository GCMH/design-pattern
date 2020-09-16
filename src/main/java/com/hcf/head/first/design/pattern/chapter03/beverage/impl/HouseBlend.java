package com.hcf.head.first.design.pattern.chapter03.beverage.impl;

import com.hcf.head.first.design.pattern.chapter03.beverage.Beverage;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class HouseBlend extends Beverage {
    @Override
    protected BigDecimal cost() {
        return null;
    }
}
