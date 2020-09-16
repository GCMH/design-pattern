package com.hcf.head.first.design.pattern.chapter03.beverage;

import lombok.Data;

import java.math.BigDecimal;

@Data
public abstract class Beverage {

    protected String description;

    protected abstract BigDecimal cost();
}
