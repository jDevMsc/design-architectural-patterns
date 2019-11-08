package com.gof.builder.vers3;

public class SubaruBuilder extends CarBuilder {

  void buildMake() {
    car.setMake("Subaru");
  }
  void buildTransmission() {
    car.setTransmission(Transmission.MANUAL);
  }
  void buildMaxSpeed() {
    car.setMaxSpeed(300);

  }
}
