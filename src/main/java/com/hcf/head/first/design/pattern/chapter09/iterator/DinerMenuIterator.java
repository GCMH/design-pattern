package com.hcf.head.first.design.pattern.chapter09.iterator;

import com.hcf.head.first.design.pattern.chapter09.Item;
import com.hcf.head.first.design.pattern.chapter09.Iterator;

public class DinerMenuIterator implements Iterator<Item> {

    private Item[] items;

    private int index;

    public DinerMenuIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (index + 1 > items.length) {
            return false;
        }
        return items[index + 1] != null;
    }

    @Override
    public Item next() {
        return items[index++];
    }
}
