package com.hcf.head.first.design.pattern.chapter10;

import com.hcf.head.first.design.pattern.chapter10.state.State;
import com.hcf.head.first.design.pattern.chapter10.state.impl.HasQuarter;
import com.hcf.head.first.design.pattern.chapter10.state.impl.NoQuarterState;
import com.hcf.head.first.design.pattern.chapter10.state.impl.SoldOutState;
import com.hcf.head.first.design.pattern.chapter10.state.impl.SoldState;
import lombok.Data;

@Data
public class GumballMachine {
    public static State SOLD_OUT;
    public static State NO_QUARTER;
    public static State HAS_QUARTER;
    public static State SOLD;

    private State state;
    private int count;

    public GumballMachine(int count) {
        SOLD = new SoldState(this);
        NO_QUARTER = new NoQuarterState(this);
        HAS_QUARTER = new HasQuarter(this);
        SOLD_OUT = new SoldOutState(this);

        state = SOLD_OUT;
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void trunkCrank() {
        state.trunkCrank();
    }

    public void dispense() {
        state.dispense();
    }

    public State getState() {
        return this.state;
    }

    public boolean hasCount() {
        this.count -= 1;
        return count >= 0;
    }
}
