package main.patterns.strategy.behaviors.fly;

import main.patterns.strategy.behaviors.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm Flying with Wings!!!!!!");
    }
}
