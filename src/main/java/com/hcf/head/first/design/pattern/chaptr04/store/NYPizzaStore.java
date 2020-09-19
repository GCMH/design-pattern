package com.hcf.head.first.design.pattern.chaptr04.store;

import com.hcf.head.first.design.pattern.chaptr04.pizza.Pizza;
import com.hcf.head.first.design.pattern.chaptr04.pizza.impl.NYCheesePizza;
import com.hcf.head.first.design.pattern.chaptr04.pizza.impl.NYPepperonPizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("cheese".equals(pizzaType)) {
            pizza = new NYCheesePizza();
        } else if ("pepperon".equals(pizzaType)) {
            return new NYPepperonPizza();
        }
        return pizza;
    }
}
