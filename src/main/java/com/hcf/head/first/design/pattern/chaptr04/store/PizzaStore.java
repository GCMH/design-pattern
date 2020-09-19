package com.hcf.head.first.design.pattern.chaptr04.store;


import com.hcf.head.first.design.pattern.chaptr04.pizza.Pizza;
import com.hcf.head.first.design.pattern.chaptr04.pizza.PizzaFactory;

public abstract class PizzaStore {

    private PizzaFactory pizzaFactory;


    public Pizza orderPizze(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String pizzaType);
}
