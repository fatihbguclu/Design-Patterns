package main.patterns.factory.factory;

import main.patterns.factory.topping.cheese.Cheese;
import main.patterns.factory.topping.clams.Clams;
import main.patterns.factory.topping.dough.Dough;
import main.patterns.factory.topping.pepperoni.Pepperoni;
import main.patterns.factory.topping.sauce.Sauce;
import main.patterns.factory.topping.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
