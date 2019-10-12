package com.SOLID.InterfaceSegregation;

import com.sun.deploy.util.Waiter;

public class Main {

  public static void main(String[] args) {
    Iworker worker = new Cook();
    worker.eat();

  }
}
