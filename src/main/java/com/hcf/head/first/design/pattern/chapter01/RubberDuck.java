package com.hcf.head.first.design.pattern.chapter01;

public class RubberDuck extends Duck {
    @Override
    protected void display() {
        System.out.println("橡皮鸭子");
    }

    @Override
    protected void quack() {
        //橡皮鸭只会吱吱叫，不会呱呱叫覆盖父类呱呱叫方法
        System.out.println("吱吱叫");
    }

    @Override
    protected void fly() {
        //橡皮鸭不糊飞
    }
}
