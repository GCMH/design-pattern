package com.hcf.head.first.design.pattern.chaptr04.ingredient.factory;

import com.hcf.head.first.design.pattern.chaptr04.ingredient.*;

import java.util.List;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    List<Veggies> createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();

}
