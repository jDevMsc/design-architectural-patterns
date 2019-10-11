package com.SOLID.LiskovSubstitution;

public class Main {

  static Rectangle  getRect() {
    return new Rectangle();
  }

  public static void main(String[] args) {
    Rectangle rectangle = getRect();
    rectangle.setHeight(10);
    rectangle.setWodth(5);
    System.out.println(rectangle.getArea());
  }


}


