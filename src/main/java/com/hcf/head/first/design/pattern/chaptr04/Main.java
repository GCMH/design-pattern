package com.hcf.head.first.design.pattern.chaptr04;

import com.hcf.head.first.design.pattern.chaptr04.pizza.Pizza;
import com.hcf.head.first.design.pattern.chaptr04.pizza.impl.CheesePizza;
import com.hcf.head.first.design.pattern.chaptr04.pizza.impl.PepperonPizza;

public class Main {
    public static void main(String[] args) {

    }

    public Pizza orderPizze(String pizzaType) {
        Pizza pizza = null;
        if ("cheese".equals(pizzaType)) {
            pizza = new CheesePizza();
        } else if ("pepperon".equals(pizzaType)) {
            return new PepperonPizza();
        }

        return pizza;
    }
}
