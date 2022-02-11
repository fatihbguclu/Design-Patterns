package main.patterns.observer.display;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
