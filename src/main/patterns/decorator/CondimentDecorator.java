package main.patterns.decorator;

import main.patterns.decorator.beverage.Beverage;

public abstract class CondimentDecorator {

    Beverage beverage;

    public abstract String getDescription();
}
