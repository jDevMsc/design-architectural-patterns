package com.gof.observer.vers2;

public class ErrObserver implements Observer {

    @Override
    public void notify(Event event) {
        System.err.println(event.getClass());
    }
}
