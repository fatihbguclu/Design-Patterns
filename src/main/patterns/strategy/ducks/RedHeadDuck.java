package main.patterns.strategy.ducks;

import main.patterns.strategy.behaviors.fly.FlyWithWings;
import main.patterns.strategy.behaviors.quack.Quack;

public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a real Red Headed Duck");
    }
}
