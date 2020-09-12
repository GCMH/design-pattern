package com.hcf.head.first.design.pattern.chapter01;

import com.hcf.head.first.design.pattern.chapter01.duck.Duck;
import com.hcf.head.first.design.pattern.chapter01.duck.sub.MallardDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
