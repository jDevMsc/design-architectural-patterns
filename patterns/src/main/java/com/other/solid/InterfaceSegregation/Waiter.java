package com.other.solid.InterfaceSegregation;

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
