package com.hcf.head.first.design.pattern.chaptr04.pizza.impl;

import com.hcf.head.first.design.pattern.chaptr04.pizza.Pizza;

public class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        this.setName("NyCheesePizza");
        this.setDough("Extra Thick Crust Dough");
        this.setSauce("Plum Tomato Sauce");

        this.getToppings().add("Shredded Mozzarella Cheese");
    }


    @Override
    public void cut() {
        System.out.println("NYCheesePizza:cut");
    }


}
