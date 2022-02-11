package main.patterns.strategy;

import main.patterns.strategy.behaviors.fly.FlyRocketPowered;
import main.patterns.strategy.ducks.Duck;
import main.patterns.strategy.ducks.MallardDuck;
import main.patterns.strategy.ducks.ModelDuck;

public class DuckDriver1 {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();

        ((MallardDuck) mallardDuck).display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();

        ((ModelDuck) modelDuck).display();
        modelDuck.performQuack();
        modelDuck.performFly();

        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }

}
