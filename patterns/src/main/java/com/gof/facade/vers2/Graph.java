package com.gof.facade.vers2;

public class Graph {

  private Axis xAxis, yAxis;
  private Description description;
  private Point pointA, pointB;
  private Line line;

  public Graph() {
    this.xAxis = new Axis("x");
    this.yAxis= new Axis("y");
    this.description = new Description("The graph of a function");
    this.pointA = new Point("A");
    this.pointB = new Point("B");
    this.line = new Line(pointA, pointB);
  }

  public void buildGraph() {
    System.out.println("Plotting");
    xAxis.add();
    yAxis.add();
    description.add();
    pointB.add();
    pointA.add();
    line.add();
  }
}
