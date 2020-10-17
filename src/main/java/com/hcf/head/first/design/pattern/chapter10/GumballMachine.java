package com.hcf.head.first.design.pattern.chapter10;

import com.hcf.head.first.design.pattern.chapter10.state.State;
import com.hcf.head.first.design.pattern.chapter10.state.impl.HasQuarter;
import com.hcf.head.first.design.pattern.chapter10.state.impl.NoQuarterState;
import com.hcf.head.first.design.pattern.chapter10.state.impl.SoldOutState;
import com.hcf.head.first.design.pattern.chapter10.state.impl.SoldState;
import com.hcf.head.first.design.pattern.chapter11.remote.GumballMachineRemote;
import lombok.Data;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

@Data
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    public static State SOLD_OUT;
    public static State NO_QUARTER;
    public static State HAS_QUARTER;
    public static State SOLD;

    private State state;
    private Integer count;

    private String local;

    public GumballMachine(String local, int count) throws Exception {
        SOLD = new SoldState(this);
        NO_QUARTER = new NoQuarterState(this);
        HAS_QUARTER = new HasQuarter(this);
        SOLD_OUT = new SoldOutState(this);

        state = SOLD_OUT;
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
        this.local = local;
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

    @Override
    public String getLocal() {
        return local;
    }

    public State getState() {
        return this.state;
    }

    public boolean hasCount() {
        this.count -= 1;
        return count >= 0;
    }

    public static void main(String[] args) {
        try {

            LocateRegistry.createRegistry(8888);
            GumballMachineRemote gumballMachineRemote = new GumballMachine(args[0], Integer.parseInt(args[1]));

            Naming.bind("rmi://localhost:8888/" + args[0], gumballMachineRemote);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
