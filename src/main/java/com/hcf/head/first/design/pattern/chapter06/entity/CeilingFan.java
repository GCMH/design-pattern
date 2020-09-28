package com.hcf.head.first.design.pattern.chapter06.entity;

import com.hcf.head.first.design.pattern.chapter06.command.Command;

public class CeilingFan {


    public static final int HIGHT = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private int speed = OFF;


    public void hight() {
        speed = HIGHT;
        System.out.println("speed:" + speed);
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("speed:" + speed);

    }

    public void log() {
        speed = LOW;
        System.out.println("speed:" + speed);

    }

    public void off() {
        speed = OFF;
        System.out.println("speed:" + speed);

    }

    public int getSpeed() {
        return speed;
    }
}
