package com.builder.vers2;

public class BuilderApp {

  public static void main(String[] args) {
    Car car = new CarBuilder().buildMake("Mers")
        .buildTransmission(Transmission.MANUAL)
        .buildSpeed(250).build();
    System.out.println(car);

  }
}
