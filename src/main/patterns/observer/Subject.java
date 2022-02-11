package main.patterns.observer;

import main.patterns.observer.display.Observer;

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
