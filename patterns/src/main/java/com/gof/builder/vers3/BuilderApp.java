package com.gof.builder.vers3;

public class BuilderApp {

  public static void main(String[] args) {
       Director director = new Director();
       director.SetBuilder(new SubaruBuilder());
       Car car = director.BuildCar();

    System.out.println(car);
  }
}
