package com.SOLID.LiskovSubstitution;

public class Rectangle implements Shape {

  int wodth;
  int height;


  @Override
  public int getArea() {
    return wodth * height;
  }

  public int getWodth() {
    return wodth;
  }

  public void setWodth(int wodth) {
    this.wodth = wodth;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

}
