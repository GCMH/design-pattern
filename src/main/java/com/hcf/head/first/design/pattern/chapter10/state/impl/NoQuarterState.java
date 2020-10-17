package com.hcf.head.first.design.pattern.chapter10.state.impl;

import com.hcf.head.first.design.pattern.chapter10.GumballMachine;
import com.hcf.head.first.design.pattern.chapter10.state.State;

public class NoQuarterState implements State {

    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入硬币");
        gumballMachine.setState(GumballMachine.HAS_QUARTER);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没有投币");
    }

    @Override
    public void trunkCrank() {
        System.out.println("没有投币");
    }

    @Override
    public void dispense() {
        System.out.println("没有投币");
    }

    @Override
    public State getState() {
        return this;
    }
}
