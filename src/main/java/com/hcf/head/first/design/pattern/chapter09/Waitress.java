package com.hcf.head.first.design.pattern.chapter09;

import com.hcf.head.first.design.pattern.chapter09.menu.Menu;


public class Waitress {

    private Menu dinerMenu;
    private Menu panckeHouseMenu;

    public Waitress(Menu dinerMenu, Menu panckeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.panckeHouseMenu = panckeHouseMenu;
    }

    public void printMenu() {

        foreach(dinerMenu.createIterator());
        foreach(panckeHouseMenu.createIterator());
    }

    private void foreach(Iterator iterator){
        while (iterator.hasNext()){
            print((Item) iterator.next());
        }
    }

    private void print(Item item) {
        System.out.println(item);
    }
}
