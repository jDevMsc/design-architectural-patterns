package com.gof.observer.vers1;

import java.util.List;

public class Subscriber implements Observer {

  String name;

  public Subscriber(String name) {
    this.name = name;
  }

  @Override
  public void handleEven(List<String> vacansies) {
    System.out.println("Dear " + name + "\n We have some changes in vacansies" + vacansies + "\n"
        + "==============================\n");
  }
}
