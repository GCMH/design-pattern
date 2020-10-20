package com.hcf.head.first.design.pattern.chapter12;

import com.hcf.head.first.design.pattern.chapter12.adapter.GooseAdapter;
import com.hcf.head.first.design.pattern.chapter12.conponent.Flock;
import com.hcf.head.first.design.pattern.chapter12.factory.AbstractFactory;
import com.hcf.head.first.design.pattern.chapter12.factory.DuckCountFactory;
import com.hcf.head.first.design.pattern.chapter12.goose.Goose;
import com.hcf.head.first.design.pattern.chapter12.observer.QuackLogist;
import com.hcf.head.first.design.pattern.chapter12.quackable.Quackable;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate(new DuckCountFactory());
    }

    void simulate(AbstractFactory factory) {
        Quackable mallardDuck = factory.createMallarDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();

        Quackable goose = new GooseAdapter(new Goose());

        Flock flockDucks = new Flock();
        flockDucks.add(mallardDuck);
        flockDucks.add(redheadDuck);
        flockDucks.add(duckCall);
        flockDucks.add(rubberDuck);
        flockDucks.add(goose);


        Quackable oneRedDuck = factory.createRedheadDuck();
        Quackable twoRedDuck = factory.createRedheadDuck();
        Flock reaDucks = new Flock();
        reaDucks.add(oneRedDuck);
        reaDucks.add(twoRedDuck);


        flockDucks.add(reaDucks);

        QuackLogist quackLogist = new QuackLogist();
        flockDucks.registerObserver(quackLogist);

        flockDucks.quack();

        System.out.println(QuackCount.getCount());
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
