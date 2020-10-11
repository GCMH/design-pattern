package com.hcf.head.first.design.pattern.chapter09.iterator;

import com.hcf.head.first.design.pattern.chapter09.Item;
import com.hcf.head.first.design.pattern.chapter09.Iterator;

import java.util.List;

public class PancakeHouseMenu implements Iterator<Item> {

    private int index;

    private List<Item> items;

    public PancakeHouseMenu(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (index + 1 > items.size() || items.get(index) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Item next() {
        return items.get(index++);
    }
}
