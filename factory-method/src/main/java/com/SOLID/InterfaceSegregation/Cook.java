package com.SOLID.InterfaceSegregation;

public class Cook implements Iworker {

  @Override
  public void work() {
    System.out.println("Working...");
  }

  @Override
  public void eat() {
    System.out.println("Eating...");

  }
}
