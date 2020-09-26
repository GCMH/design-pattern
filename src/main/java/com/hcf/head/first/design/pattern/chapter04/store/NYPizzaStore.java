package com.hcf.head.first.design.pattern.chapter04.store;

import com.hcf.head.first.design.pattern.chapter04.ingredient.factory.PizzaIngredientFactory;
import com.hcf.head.first.design.pattern.chapter04.ingredient.factory.impl.NYPizzaIngredientFactory;
import com.hcf.head.first.design.pattern.chapter04.pizza.Pizza;
import com.hcf.head.first.design.pattern.chapter04.pizza.impl.NYCheesePizza;
import com.hcf.head.first.design.pattern.chapter04.pizza.impl.NYPepperonPizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(pizzaType)) {
            pizza = new NYCheesePizza(pizzaIngredientFactory);
        } else if ("pepperon".equals(pizzaType)) {
            return new NYPepperonPizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
