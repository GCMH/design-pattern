package com.hcf.head.first.design.pattern.chaptr04;

import com.hcf.head.first.design.pattern.chaptr04.store.NYPizzaStore;
import com.hcf.head.first.design.pattern.chaptr04.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        nyStore.orderPizze("cheese");

    }
}
