package main.patterns.strategy.ducks;

import main.patterns.strategy.behaviors.fly.FlyBehavior;
import main.patterns.strategy.behaviors.fly.FlyNoWay;
import main.patterns.strategy.behaviors.quack.QuackBehavior;
import main.patterns.strategy.behaviors.quack.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        //quackBehavior = () -> System.out.println("Squeak");  //Java 8 feature
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    void display() {
        System.out.println("I'm a rubber duckie");
    }
}
