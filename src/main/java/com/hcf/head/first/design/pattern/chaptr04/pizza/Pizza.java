package com.hcf.head.first.design.pattern.chaptr04.pizza;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Pizza {

    private String name;

    private String dough;

    private String sauce;

    private List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("default prepare");
        System.out.println("name:" + name + " dough:" + dough + " sauce:" + sauce);
        System.out.print("toppings:");
        toppings.stream().forEach(System.out::print);
        System.out.println();
    }

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
