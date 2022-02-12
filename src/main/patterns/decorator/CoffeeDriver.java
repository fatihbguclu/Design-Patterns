package main.patterns.decorator;

import main.patterns.decorator.beverage.Beverage;
import main.patterns.decorator.beverage.DarkRoast;
import main.patterns.decorator.beverage.Espresso;
import main.patterns.decorator.beverage.HouseBlend;

public class CoffeeDriver {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        CondimentDecorator decorator2 = new Mocha(beverage2);

        System.out.println(decorator2.getDescription()
                + " $" + ((Mocha) decorator2).cost());


    }

}
