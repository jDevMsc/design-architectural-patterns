package com.Visitor.vers2;

//Кузов
public class BodyElement implements Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);

  }
}
