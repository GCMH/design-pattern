package com.hcf.head.first.design.pattern.chaptr04.pizza;

import com.hcf.head.first.design.pattern.chaptr04.ingredient.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Pizza {

    private String name;

    private Dough dough;

    private Sauce sauce;

    private List<Veggies> veggies = new ArrayList<>();

    private Cheese cheese;

    private Pepperoni pepperoni;

    private Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("default bake");
    }

    public void cut() {
        System.out.println("default cut");
    }

    public void box() {
        System.out.println("default box");
    }


}
