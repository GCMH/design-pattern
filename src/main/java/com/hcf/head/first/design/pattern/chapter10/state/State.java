package com.hcf.head.first.design.pattern.chapter10.state;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void trunkCrank();
    void dispense();
    State getState();
}
