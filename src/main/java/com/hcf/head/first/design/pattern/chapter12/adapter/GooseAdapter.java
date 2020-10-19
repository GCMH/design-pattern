package com.hcf.head.first.design.pattern.chapter12.adapter;

import com.hcf.head.first.design.pattern.chapter12.goose.Goose;
import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
