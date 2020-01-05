package com.gof.memento.vers3;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    public static void main(String[] args) {
        List<Memento> savedStates = new ArrayList<>();

        Originator originator = new Originator();
        originator.setState("A");
        originator.setState("B");
        savedStates.add(originator.saveToMemento());
        originator.setState("C");
        savedStates.add(originator.saveToMemento());
        originator.setState("D");

        originator.restoreFromMemento(savedStates.get(1));
        originator.restoreFromMemento(savedStates.get(0));



    }
}
