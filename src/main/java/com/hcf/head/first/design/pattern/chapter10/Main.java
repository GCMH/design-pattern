package com.hcf.head.first.design.pattern.chapter10;

public class Main {
    public static void main(String[] args) throws Exception {

        GumballMachine gumballMachine = new GumballMachine("wh",1);

        gumballMachine.insertQuarter();
        gumballMachine.trunkCrank();
        gumballMachine.dispense();

        gumballMachine.insertQuarter();
    }
}
