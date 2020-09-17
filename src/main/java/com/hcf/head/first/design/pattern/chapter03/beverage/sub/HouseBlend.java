package com.hcf.head.first.design.pattern.chapter03.beverage.sub;

import com.hcf.head.first.design.pattern.chapter03.beverage.Beverage;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class HouseBlend extends Beverage {

    public HouseBlend(){
        this.description = "houseBlend ";
    }

    @Override
    public BigDecimal cost() {
        BigDecimal cost = BigDecimal.ZERO;
        return cost.add(new BigDecimal(20));
    }
}
