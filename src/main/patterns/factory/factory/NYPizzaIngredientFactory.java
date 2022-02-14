package main.patterns.factory.factory;

import main.patterns.factory.topping.cheese.Cheese;
import main.patterns.factory.topping.cheese.ReggianoCheese;
import main.patterns.factory.topping.clams.Clams;
import main.patterns.factory.topping.clams.FreshClams;
import main.patterns.factory.topping.dough.Dough;
import main.patterns.factory.topping.dough.ThinCrustDough;
import main.patterns.factory.topping.pepperoni.Pepperoni;
import main.patterns.factory.topping.pepperoni.SlicedPepperoni;
import main.patterns.factory.topping.sauce.MarinaraSauce;
import main.patterns.factory.topping.sauce.Sauce;
import main.patterns.factory.topping.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
