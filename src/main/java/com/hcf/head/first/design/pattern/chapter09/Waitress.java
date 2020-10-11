package com.hcf.head.first.design.pattern.chapter09;

import com.hcf.head.first.design.pattern.chapter09.menu.MenuComponent;


public class Waitress {

    private MenuComponent menu;

    public Waitress(MenuComponent menu) {
        this.menu = menu;
    }

    public void printMenu() {
        menu.print();
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
