package com.Decorator.vers2;

public class Milk implements Product {

  private final int price;

  public Milk(int price) {
    this.price = price;
  }

  public int getPrice() {
    return this.price;
  }
}
