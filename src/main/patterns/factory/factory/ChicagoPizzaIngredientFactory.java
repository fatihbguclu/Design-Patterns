package main.patterns.factory.factory;

import main.patterns.factory.topping.cheese.Cheese;
import main.patterns.factory.topping.cheese.MozzarellaCheese;
import main.patterns.factory.topping.clams.Clams;
import main.patterns.factory.topping.clams.FrozenClams;
import main.patterns.factory.topping.dough.Dough;
import main.patterns.factory.topping.dough.ThickCrustDough;
import main.patterns.factory.topping.pepperoni.Pepperoni;
import main.patterns.factory.topping.pepperoni.SlicedPepperoni;
import main.patterns.factory.topping.sauce.PlumTomatoSauce;
import main.patterns.factory.topping.sauce.Sauce;
import main.patterns.factory.topping.veggies.BlackOlives;
import main.patterns.factory.topping.veggies.Eggplant;
import main.patterns.factory.topping.veggies.Spinach;
import main.patterns.factory.topping.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
