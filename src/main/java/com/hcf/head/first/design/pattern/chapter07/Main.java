package com.hcf.head.first.design.pattern.chapter07;


import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator enumerationIterator = new EnumerationIterator(list.elements());
        while (enumerationIterator.hasNext()) {
            System.out.println(enumerationIterator.next());
        }
    }
}
