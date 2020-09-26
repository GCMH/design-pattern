package com.hcf.head.first.design.pattern.chapter04;

import com.hcf.head.first.design.pattern.chapter04.store.NYPizzaStore;
import com.hcf.head.first.design.pattern.chapter04.store.PizzaStore;

public class Main {
    static Object i = 3;
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        nyStore.orderPizze("cheese");


    }
}
