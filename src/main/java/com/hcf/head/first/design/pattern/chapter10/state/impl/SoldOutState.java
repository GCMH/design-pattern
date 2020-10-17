package com.hcf.head.first.design.pattern.chapter10.state.impl;

import com.hcf.head.first.design.pattern.chapter10.GumballMachine;
import com.hcf.head.first.design.pattern.chapter10.state.State;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("奖品告罄");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("奖品告罄");
    }

    @Override
    public void trunkCrank() {
        System.out.println("奖品告罄");
    }

    @Override
    public void dispense() {
        System.out.println("奖品告罄");
    }

    @Override
    public State getState() {
        return this;
    }
}
