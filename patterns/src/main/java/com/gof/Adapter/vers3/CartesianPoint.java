package com.gof.Adapter.vers3;

//legacy  functional
public class CartesianPoint implements Cartesian {

    @Override
    public void setPoint(double x, double y) {
        System.out.println("x : " + x + " , y : " + y);
    }
}
