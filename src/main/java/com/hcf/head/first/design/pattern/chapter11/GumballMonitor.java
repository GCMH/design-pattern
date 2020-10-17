package com.hcf.head.first.design.pattern.chapter11;

import com.hcf.head.first.design.pattern.chapter11.remote.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMonitor {
    private GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void report() throws RemoteException {
        System.out.println(gumballMachine.getState());
        System.out.println(gumballMachine.getLocal());
        System.out.println(gumballMachine.getCount());
    }
}
