package com.hcf.head.first.design.pattern.chapter09;

import com.hcf.head.first.design.pattern.chapter09.iterator.CompositeIterator;
import com.hcf.head.first.design.pattern.chapter09.menu.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

    private String name;

    private String descript;

    private List<MenuComponent> components = new ArrayList<>();

    public Menu(String name, String descript) {
        this.name = name;
        this.descript = descript;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        components.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        components.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return components.get(index);
    }

    @Override
    public void print() {
        System.out.println(name);
        Iterator<MenuComponent> iterator = components.iterator();
        while (iterator.hasNext()) {
            MenuComponent next = iterator.next();
            next.print();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescript() {
        return descript;
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(components.iterator());
    }
}
