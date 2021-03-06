package com.hcf.head.first.design.pattern.chapter01;

import com.hcf.head.first.design.pattern.chapter01.duck.Duck;
import com.hcf.head.first.design.pattern.chapter01.duck.sub.MallardDuck;
import com.hcf.head.first.design.pattern.chapter01.duck.sub.ModelDuck;
import com.hcf.head.first.design.pattern.chapter01.fly.impl.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
