package com.hcf.head.first.design.pattern.chapter07.adapter;

import com.hcf.head.first.design.pattern.chapter07.turkey.Turkey;
import com.hcf.head.first.design.pattern.chapter07.duck.Duck;

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
