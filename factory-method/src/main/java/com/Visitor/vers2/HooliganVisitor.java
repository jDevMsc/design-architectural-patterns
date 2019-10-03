package com.Visitor.vers2;

public class HooliganVisitor implements Visitor {

  @Override
  public void visit(EngineElement engineElement) {
    System.out.println("Завел двигатель");
  }

  @Override
  public void visit(BodyElement engineElement) {
    System.out.println("Постучал по корпусу");

  }
}
