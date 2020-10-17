package com.hcf.head.first.design.pattern.chapter11;

import com.hcf.head.first.design.pattern.chapter11.remote.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        GumballMachineRemote rs = (GumballMachineRemote) Naming.lookup("rmi://localhost:8888/wh");
        GumballMonitor gumballMonitor = new GumballMonitor(rs);
        gumballMonitor.report();
    }
}
