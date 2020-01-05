package com.gof.observer.vers2;

import java.util.ArrayList;
import java.util.List;

//source of event,contains list of observers
public class Subject {

    private final List<Observer> observers = new ArrayList<>();

    //register new observer
    public void register(Observer observer) {
        observers.add(observer);
    }

    //unRegister new observer
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }
    //notify ALL observer
    public void notify(Event event) {
        observers.forEach(observer -> observer.notify(event));
    }
}

