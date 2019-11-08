package com.gof.builder.vers3;


public abstract class CarBuilder {

  Car car;

  void createCAr() {
    car =  new Car();
  }

  Car getCar() {
    return car;
  }

  abstract void  buildMake();
  abstract void buildTransmission();
  abstract void buildMaxSpeed();





}
