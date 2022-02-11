package main.patterns.strategy.ducks;

import main.patterns.strategy.behaviors.fly.FlyNoWay;
import main.patterns.strategy.behaviors.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model Duck");
    }
}
