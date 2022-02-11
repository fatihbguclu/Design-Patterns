package main.patterns.strategy.behaviors.fly;

import main.patterns.strategy.behaviors.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm Flying With A Rocket!");
    }
}
