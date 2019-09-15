package com.Bridge.vers2;

public class Main {

  public static void main(String[] args) {
    Vehicle vehicle = new Car(new Toyota());
    vehicle.drive();
    Vehicle vehicle2 = new Truck(new Audi());
    vehicle2.drive();
    Vehicle vehicle3 = new Car(new Mersedes());
    vehicle3.drive();
  }

}
