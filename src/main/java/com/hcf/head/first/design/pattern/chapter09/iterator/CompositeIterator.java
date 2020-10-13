package com.hcf.head.first.design.pattern.chapter09.iterator;

import com.hcf.head.first.design.pattern.chapter09.Menu;
import com.hcf.head.first.design.pattern.chapter09.menu.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    private Stack stack = new Stack();

    private Iterator iterator;

    public CompositeIterator(Iterator iterator) {
        this.iterator = iterator;
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        Iterator iterator = (Iterator) stack.peek();
        if (iterator.hasNext()) {
            return true;
        } else {
            stack.pop();
            return hasNext();
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
