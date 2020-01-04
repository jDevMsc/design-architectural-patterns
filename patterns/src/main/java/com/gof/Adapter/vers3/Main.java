package com.gof.Adapter.vers3;

/**
 * Client
 */
public class Main {

    public static void main(String[] args) {
        Polar adapter = new Polar2CartesianAdapter(new CartesianPoint());

        adapter.setPoint(0, 42);
        adapter.setPoint(1, Math.PI / 2);
        adapter.setPoint(2, Math.PI );
    }
}
