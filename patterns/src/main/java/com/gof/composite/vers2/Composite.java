package com.gof.composite.vers2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {

  private List<Shape> components = new ArrayList<Shape>();

  public void addComponent(Shape shape) {
    components.add(shape);
  }

  public void removeComponent(Shape shape) {
  components.remove(shape);
  }


  public void draw() {
    for (Shape shape : components) {
      shape.draw();
    }
  }
}
