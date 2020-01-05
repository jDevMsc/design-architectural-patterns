package com.gof.memento.vers3;

public class Memento {

    private final String state;

    public Memento(String stateToSave) {
        this.state = stateToSave; //can do copy
    }

    public String getSavedState() {
        return state;
    }
}
