package com.hcf.head.first.design.pattern.chapter04.ingredient.factory;

import com.hcf.head.first.design.pattern.chapter04.ingredient.*;

import java.util.List;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    List<Veggies> createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();

}
