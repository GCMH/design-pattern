package com.hcf.head.first.design.pattern.chaptr04.ingredient.factory.impl;

import com.hcf.head.first.design.pattern.chaptr04.ingredient.*;
import com.hcf.head.first.design.pattern.chaptr04.ingredient.factory.PizzaIngredientFactory;

import java.util.ArrayList;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        List<Veggies> veggies = new ArrayList<>();
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
