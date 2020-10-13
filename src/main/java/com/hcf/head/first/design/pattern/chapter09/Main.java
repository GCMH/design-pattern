package com.hcf.head.first.design.pattern.chapter09;

import com.hcf.head.first.design.pattern.chapter09.menu.MenuComponent;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        MenuComponent allMenu = new Menu("all menu", "all menu");
        MenuComponent dinerMenu = new Menu("dinerMenu menu", "dinerMenu menu");
        MenuComponent cafeMenu = new Menu("cafe menu", "cafe menu");


        dinerMenu.add(new Item("a", new BigDecimal(10)));
        dinerMenu.add(new Item("b", new BigDecimal(11)));

        cafeMenu.add(new Item("c", new BigDecimal(20)));
        cafeMenu.add(new Item("d", new BigDecimal(21)));

        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);

        Waitress waitress = new Waitress(allMenu);
        waitress.printAll();
    }
}
