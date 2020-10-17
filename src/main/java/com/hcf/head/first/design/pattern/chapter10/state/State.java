package com.hcf.head.first.design.pattern.chapter10.state;

import java.io.Serializable;

public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void trunkCrank();
    void dispense();
    State getState();
}
