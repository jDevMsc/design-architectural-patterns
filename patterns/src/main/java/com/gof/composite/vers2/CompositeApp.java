package com.gof.composite.vers2;

public class CompositeApp {

  public static void main(String[] args) {

    Shape square1 = new Square();
    Shape triangle = new Triangle();
    Shape circle= new Circle();

    Composite composite = new Composite();
    composite.addComponent(square1);
    composite.addComponent(triangle);
    composite.addComponent(circle);

    composite.draw();


  }

}
