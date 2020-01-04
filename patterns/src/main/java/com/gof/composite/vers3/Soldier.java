package com.gof.composite.vers3;

public class Soldier implements Unit{

    @Override
    public void move() {
        System.out.println("Starting running...");

    }

    @Override
    public void attack() {
        System.out.println("Start gun...");

    }

    @Override
    public void hold() {
        System.out.println("Stop soldier...");

    }
}
