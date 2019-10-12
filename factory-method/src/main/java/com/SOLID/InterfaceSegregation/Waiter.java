package com.SOLID.InterfaceSegregation;

public class Waiter implements Worker {

  @Override
  public void work() {
    System.out.println("Only working...");
  }

//  @Override
//  public void eat() {
//  //empty if implements Iworker
//  }
}
