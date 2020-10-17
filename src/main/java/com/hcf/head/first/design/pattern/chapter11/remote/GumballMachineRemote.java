package com.hcf.head.first.design.pattern.chapter11.remote;

import com.hcf.head.first.design.pattern.chapter10.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {

    String getLocal() throws RemoteException;

    State getState() throws RemoteException;

    Integer getCount() throws RemoteException;
}
