package com.hcf.head.first.design.pattern.chapter01;

public abstract class Duck {

    protected void quack() {
        System.out.println("呱呱叫");
    }

    protected void swim() {
        System.out.println("游泳");
    }

    protected abstract void display();


}
