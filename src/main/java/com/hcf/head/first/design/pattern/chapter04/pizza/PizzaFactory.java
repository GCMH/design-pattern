package com.hcf.head.first.design.pattern.chapter04.pizza;

import com.hcf.head.first.design.pattern.chapter04.pizza.impl.CheesePizza;
import com.hcf.head.first.design.pattern.chapter04.pizza.impl.PepperonPizza;

public class PizzaFactory {

    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("cheese".equals(pizzaType)) {
            pizza = new CheesePizza();
        } else if ("pepperon".equals(pizzaType)) {
            return new PepperonPizza();
        }
        return pizza;
    }
}
