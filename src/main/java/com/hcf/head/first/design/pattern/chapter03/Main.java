package com.hcf.head.first.design.pattern.chapter03;

import com.hcf.head.first.design.pattern.chapter03.beverage.Beverage;
import com.hcf.head.first.design.pattern.chapter03.beverage.sub.DarkRoast;
import com.hcf.head.first.design.pattern.chapter03.condiment.Milk;
import com.hcf.head.first.design.pattern.chapter03.condiment.Soy;

public class Main {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();

        darkRoast = new Milk(darkRoast);
        darkRoast = new Soy(darkRoast);

        System.out.println(darkRoast.getDescription() + darkRoast.cost());

    }
}
