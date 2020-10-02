package com.hcf.head.first.design.pattern.chapter07.facade;

public class TheaterLight {
    public void dim(int i) {
        System.out.println("TheaterLight dim " + i);
    }

    public void on() {
        System.out.println("TheaterLight on");
    }
}
