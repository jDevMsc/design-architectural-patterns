package com.Adapter.vers2;

public class Runner {

  public static void main(String[] args) {
    CarWash carWash = new CarWash();
    carWash.washCar(new TruckAdapter(new MyTruck()));
  }
}
