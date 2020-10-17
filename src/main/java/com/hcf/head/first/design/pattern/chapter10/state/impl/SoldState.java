package com.hcf.head.first.design.pattern.chapter10.state.impl;

import com.hcf.head.first.design.pattern.chapter10.GumballMachine;
import com.hcf.head.first.design.pattern.chapter10.state.State;

public class SoldState implements State {

    transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经放入硬币");
    }

    @Override
    public void ejectQuarter() {
        gumballMachine.setState(gumballMachine.NO_QUARTER);
        System.out.println("退币成功");
    }

    @Override
    public void trunkCrank() {
        System.out.println("已经按下，请等待");
    }

    @Override
    public void dispense() {
        System.out.println("出奖中，请等待");
        if (gumballMachine.hasCount()) {
            System.out.println("出奖");
        }
        if (gumballMachine.hasCount()) {
            gumballMachine.setState(GumballMachine.NO_QUARTER);
        } else {
            System.out.println("奖品告罄");
            gumballMachine.setState(GumballMachine.SOLD_OUT);
            gumballMachine.setCount(gumballMachine.getCount() + 1);
        }
    }

    @Override
    public State getState() {
        return this;
    }
}
