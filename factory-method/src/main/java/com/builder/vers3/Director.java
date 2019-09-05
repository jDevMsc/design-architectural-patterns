package com.builder.vers3;

public class Director {
  CarBuilder builder;

  void SetBuilder(CarBuilder b) {
    builder = b;
  }

  Car BuildCar() {
    builder.createCAr();
    builder.buildMake();
    builder.buildTransmission();
    builder.buildMaxSpeed();
    Car car = builder.getCar();
    return car;
  }
}
