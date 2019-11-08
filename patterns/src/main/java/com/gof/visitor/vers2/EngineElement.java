package com.gof.visitor.vers2;

//Двигатель
public class EngineElement implements Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
