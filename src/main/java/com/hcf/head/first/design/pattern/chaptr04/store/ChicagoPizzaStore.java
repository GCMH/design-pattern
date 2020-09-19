package com.hcf.head.first.design.pattern.chaptr04.store;

import com.hcf.head.first.design.pattern.chaptr04.pizza.impl.ChicagoCheesePizza;
import com.hcf.head.first.design.pattern.chaptr04.pizza.Pizza;
import com.hcf.head.first.design.pattern.chaptr04.pizza.impl.ChicagoPepperonPizza;
import com.hcf.head.first.design.pattern.chaptr04.pizza.impl.PepperonPizza;

public class ChicagoPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("cheese".equals(pizzaType)) {
            pizza = new ChicagoCheesePizza();
        } else if ("pepperon".equals(pizzaType)) {
            return new ChicagoPepperonPizza();
        }
        return pizza;
    }
}
