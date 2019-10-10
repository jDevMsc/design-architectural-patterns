package com.SOLID.OpenClosePrinciple;

public class Toyota implements Car {

  void getPassenger() {
    System.out.println("get passangers");
  }



  @Override
  public void worlInTaxi() {
    getPassenger();
  }
}
