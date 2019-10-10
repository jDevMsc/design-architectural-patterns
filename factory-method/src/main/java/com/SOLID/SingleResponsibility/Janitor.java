package com.SOLID.SingleResponsibility;

public class Janitor extends  Employee {

  @Override
  int getSalary() {
    return 50;
  }

  void cleanFloor(){}
}
