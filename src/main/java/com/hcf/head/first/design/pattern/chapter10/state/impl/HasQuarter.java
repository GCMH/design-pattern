package com.hcf.head.first.design.pattern.chapter10.state.impl;

import com.hcf.head.first.design.pattern.chapter10.GumballMachine;
import com.hcf.head.first.design.pattern.chapter10.state.State;

public class HasQuarter implements State {
    private GumballMachine gumballMachine;

    public HasQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经投币");
    }

    @Override
    public void ejectQuarter() {
        gumballMachine.setState(GumballMachine.NO_QUARTER);
        System.out.println("退币成功");
    }

    @Override
    public void trunkCrank() {
        gumballMachine.setState(GumballMachine.SOLD);
    }

    @Override
    public void dispense() {
        System.out.println("等待...");
    }

    @Override
    public State getState() {
        return this;
    }
}
