package com.hcf.head.first.design.pattern.chaptr04.pizza.impl;

import com.hcf.head.first.design.pattern.chaptr04.ingredient.factory.PizzaIngredientFactory;
import com.hcf.head.first.design.pattern.chaptr04.pizza.Pizza;

public class NYCheesePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }


    @Override
    public void prepare() {
        this.setDough(pizzaIngredientFactory.createDough());
        this.setSauce(pizzaIngredientFactory.createSauce());
        this.setCheese(pizzaIngredientFactory.createCheese());
        this.setPepperoni(pizzaIngredientFactory.createPepperoni());
        this.setClams(pizzaIngredientFactory.createClams());
    }

    @Override
    public void cut() {
        System.out.println("NYCheesePizza:cut");
    }


}
