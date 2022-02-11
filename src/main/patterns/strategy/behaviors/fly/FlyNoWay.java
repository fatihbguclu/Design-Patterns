package main.patterns.strategy.behaviors.fly;

import main.patterns.strategy.behaviors.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't Fly ");
    }
}
