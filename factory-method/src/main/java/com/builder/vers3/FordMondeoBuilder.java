package com.builder.vers3;

public class FordMondeoBuilder extends  CarBuilder {

  void buildMake() {
    car.setMake("Ford Mondeo");
  }
  void buildTransmission() {
    car.setTransmission(Transmission.AUTO);
  }
  void buildMaxSpeed() {
    car.setMaxSpeed(260);

  }
}
