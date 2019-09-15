package com.Bridge.vers2;

public class Truck extends Vehicle {

  public Truck(Model model) {
    super(model);
  }

  @Override
  void drive() {
    model.drive("Drive Truck");
  }
}
