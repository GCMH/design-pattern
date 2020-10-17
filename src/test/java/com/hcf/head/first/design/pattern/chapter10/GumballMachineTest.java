package com.hcf.head.first.design.pattern.chapter10;

import org.junit.Assert;
import org.junit.Test;


public class GumballMachineTest {


    @Test
    public void should_no_quarter_when_insertQuarter_and_trunkCrank() throws Exception {
        GumballMachine gumballMachine = new GumballMachine("wh",10);
        gumballMachine.insertQuarter();
        gumballMachine.trunkCrank();
        gumballMachine.dispense();

        Assert.assertEquals(gumballMachine.getState(), GumballMachine.NO_QUARTER);
    }

    @Test
    public void should_no_quarter_when_trunkCrank() throws Exception {
        GumballMachine gumballMachine = new GumballMachine("wh",10);
        gumballMachine.trunkCrank();
        gumballMachine.dispense();

        Assert.assertEquals(gumballMachine.getState(), GumballMachine.NO_QUARTER);
    }

    @Test
    public void should_sold_when_trunkCrank() throws Exception {
        GumballMachine gumballMachine = new GumballMachine("wh",1);
        gumballMachine.insertQuarter();
        gumballMachine.trunkCrank();
        gumballMachine.dispense();

        Assert.assertEquals(gumballMachine.getState(), GumballMachine.SOLD_OUT);
    }
}