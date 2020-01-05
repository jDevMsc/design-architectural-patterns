package com.gof.observer.vers2;

//we have a source message two implementations are subscribed to it (out and error)
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.register(new OutObserver());
        subject.register(new OutObserver());
        subject.register(new ErrObserver());

        subject.notify(new Event());
    }
}
