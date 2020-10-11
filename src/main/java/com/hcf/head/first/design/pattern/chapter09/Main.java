package com.hcf.head.first.design.pattern.chapter09;

import com.hcf.head.first.design.pattern.chapter09.menu.DinerMenu;
import com.hcf.head.first.design.pattern.chapter09.menu.PanckeHouseMenu;

public class Main {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new DinerMenu(), new PanckeHouseMenu());
        waitress.printMenu();
    }
}
