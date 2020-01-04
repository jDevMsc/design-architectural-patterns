package com.gof.composite.vers3;

public class Panzer  implements Unit{

    @Override
    public void move() {
        System.out.println("Starting engine...");
    }

    @Override
    public void attack() {
        System.out.println("Aiming...");

    }

    @Override
    public void hold() {
        System.out.println("Stop machine...");

    }
}
