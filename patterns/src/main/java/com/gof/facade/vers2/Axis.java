package com.gof.facade.vers2;

public class Axis implements Element {

  private String axis;

  public Axis(String axis) {
    this.axis = axis;
  }

  @Override
  public void add() {
    System.out.println(axis + "  added." );
  }
}
