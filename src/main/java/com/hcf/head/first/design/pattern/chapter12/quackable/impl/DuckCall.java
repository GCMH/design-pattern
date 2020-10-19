package com.hcf.head.first.design.pattern.chapter12.quackable.impl;

import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("DuckCall quack");
    }
}
