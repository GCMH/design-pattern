package com.hcf.head.first.design.pattern.chapter07.facade;

public class Amplifier {
    public void setVolum(int i) {
        System.out.println("Amplifier volum " + i);
    }

    public void setSurroundSound() {
        System.out.println("Amplifier setSurroundSound");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Amplifier setDvc" + dvd);
    }

    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}
