package com.facade.vers2;

public class Point implements Element{

  private String pointTitle;

  public Point(String pointTitle) {
    this.pointTitle = pointTitle;
  }

  public String getPointTitle() {
    return pointTitle;
  }

  @Override
  public void add() {
    System.out.println( pointTitle + " added");
  }
}
