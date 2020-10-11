package com.hcf.head.first.design.pattern.chapter09.menu;

import com.hcf.head.first.design.pattern.chapter09.Item;
import com.hcf.head.first.design.pattern.chapter09.Iterator;
import com.hcf.head.first.design.pattern.chapter09.iterator.DinerMenuIterator;

import java.math.BigDecimal;

public class DinerMenu implements Menu{

    private Item[] items;

    private static final int MAX_SIZE = 6;

    private int index = 0;

    public DinerMenu() {
        items = new Item[MAX_SIZE];

        addItem("a", new BigDecimal(12));
        addItem("b", new BigDecimal(13));
        addItem("c", new BigDecimal(14));

    }

    private void addItem(String name, BigDecimal price) {
        if (index + 1 >= MAX_SIZE) {
            return;
        }
        items[index++] = new Item(name, price);
    }

    public Item[] getMenu() {
        return items;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(items);
    }

}
