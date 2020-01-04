package com.gof.composite.vers3;

import java.util.ArrayList;
import java.util.List;

public class UnitsGroup implements Unit{

    //group
    private final List<Unit> units = new ArrayList<>();

    public void addUnit(Unit unit) {
        units.add(unit);
    }
    public void remove(Unit unit) {
        units.remove(unit);
    }

    //operations
    public void move() {
        units.forEach(Unit::move);
    }
    public void attack() {
        units.forEach(Unit::attack);
    }

    public void hold() {
        units.forEach(Unit::hold);
    }

}
