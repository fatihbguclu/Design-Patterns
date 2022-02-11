package main.patterns.strategy.ducks;

import main.patterns.strategy.behaviors.fly.FlyWithWings;
import main.patterns.strategy.behaviors.quack.Quack;

public class MallardDuck extends Duck{


    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
