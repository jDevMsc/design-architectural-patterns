package com.SOLID.OpenClosePrinciple;

public class Celica extends Toyota  {

  @Override
  void getPassenger() {
    System.out.println("get one passanger");
  }

  @Override
  public void worlInTaxi() {
    getPassenger();
  }
}
