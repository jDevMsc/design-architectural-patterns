package com.other.solid.SingleResponsibility;

public class Janitor extends  Employee {

  @Override
  int getSalary() {
    return 50;
  }

  void cleanFloor(){}
}
