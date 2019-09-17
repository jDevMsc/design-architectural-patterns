package com.Decorator.vers2;

public class Shop {

  public static void main(String[] args) {
    Product milk = new Milk(50);
    Product milkDiscount = new MilkDiscont(milk);

    System.out.println(milkDiscount.getPrice());
  }
}
