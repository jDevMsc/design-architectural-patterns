package com.gof.facade.vers2;

public class Line implements Element {
  private Point pointFirst;
  private Point pointSecond;

  public Line(Point pointFirst, Point pointSecond) {
    this.pointFirst = pointFirst;
    this.pointSecond = pointSecond;
  }

  @Override
  public void add() {
    System.out.println("Line create with points : " + pointFirst.getPointTitle() +" " + pointSecond.getPointTitle());
  }
}
