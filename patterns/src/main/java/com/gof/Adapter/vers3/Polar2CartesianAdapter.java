package com.gof.Adapter.vers3;

/**
 * Adapter wrapper, work through another service(Cartesian)
 */
public class Polar2CartesianAdapter implements Polar {
        private final Cartesian cartesian;

    public Polar2CartesianAdapter(Cartesian cartesian) {
        this.cartesian = cartesian;
    }

    @Override
    public void setPoint(double r, double theta) {
        cartesian.setPoint(r *  Math.cos(theta), Math.sin(theta));
    }
}
