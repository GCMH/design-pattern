package com.hcf.head.first.design.pattern.chapter03;

import com.hcf.head.first.design.pattern.chapter03.beverage.Beverage;
import com.hcf.head.first.design.pattern.chapter03.beverage.impl.DarkRoast;

public class Main {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast.setMilk(true);
        System.out.println(darkRoast.cost());
    }
}
