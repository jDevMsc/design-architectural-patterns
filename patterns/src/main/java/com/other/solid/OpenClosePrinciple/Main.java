package com.other.solid.OpenClosePrinciple;

public class Main {

  public static void main(String[] args) {
//    Toyota toyota = new Toyota();
    Car car = new Celica();
    workInTaxi(car);

  }

  static void workInTaxi(Car car) {
    car.worlInTaxi();
  }

}
