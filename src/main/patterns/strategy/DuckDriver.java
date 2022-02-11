package main.patterns.strategy;

import main.patterns.strategy.behaviors.fly.FlyBehavior;
import main.patterns.strategy.behaviors.fly.FlyRocketPowered;
import main.patterns.strategy.behaviors.quack.QuackBehavior;
import main.patterns.strategy.ducks.*;

public class DuckDriver {

    public static void main(String[] args){

        FlyBehavior flyBehavior = () -> System.out.println("I can't Fly");
        QuackBehavior quackBehavior = () -> System.out.println("Squeak");

        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck(flyBehavior,quackBehavior);
        DecoyDuck decoyDuck = new DecoyDuck();

        Duck modelDuck = new ModelDuck();

        mallardDuck.performQuack();
        rubberDuck.performQuack();
        decoyDuck.performQuack();

        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }

}
