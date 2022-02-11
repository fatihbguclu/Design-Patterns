package main.patterns.strategy.behaviors.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silent Quack >>");
    }
}
