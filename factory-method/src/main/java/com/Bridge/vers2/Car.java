package com.Bridge.vers2;

public class Car extends Vehicle {

  public Car(Model model) {
    super(model);
  }

  @Override
  void drive() {
    model.drive("Drive Car");
  }
}
