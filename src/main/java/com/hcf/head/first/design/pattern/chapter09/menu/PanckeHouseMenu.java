package com.hcf.head.first.design.pattern.chapter09.menu;

import com.hcf.head.first.design.pattern.chapter09.Item;
import com.hcf.head.first.design.pattern.chapter09.Iterator;
import com.hcf.head.first.design.pattern.chapter09.iterator.PancakeHouseMenu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PanckeHouseMenu implements Menu{

    private List<Item> items;

    public PanckeHouseMenu() {
        items = new ArrayList<>();
        items.add(new Item("e", new BigDecimal(21)));
        items.add(new Item("f", new BigDecimal(22)));
        items.add(new Item("g", new BigDecimal(23)));
    }

    public List<Item> getMenu() {
        return items;
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenu(items);
    }
}
