package main.patterns.strategy.ducks;

import main.patterns.strategy.behaviors.fly.FlyNoWay;
import main.patterns.strategy.behaviors.quack.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("I'm a Decoy Duck");
    }
}
