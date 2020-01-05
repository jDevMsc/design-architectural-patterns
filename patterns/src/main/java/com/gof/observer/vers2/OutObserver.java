package com.gof.observer.vers2;

public class OutObserver implements Observer {

    @Override
    public void notify(Event event) {
        System.out.println(event.getClass());
    }
}
