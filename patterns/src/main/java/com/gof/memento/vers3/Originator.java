package com.gof.memento.vers3;

public class Originator {
    //State of the Originator in the Memento
    private String state;

    public void setState(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }

    public Memento saveToMemento() {
        System.out.println("Originator: Saving  " + this.state + " to Memento");
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator:  State after restoring from Memento : " + memento);
    }
}
