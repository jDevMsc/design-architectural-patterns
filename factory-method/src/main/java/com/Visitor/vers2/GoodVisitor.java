package com.Visitor.vers2;

public class GoodVisitor implements Visitor {

  @Override
  public void visit(EngineElement engineElement) {
    System.out.println("Проверил двигательно");

  }

  @Override
  public void visit(BodyElement engineElement) {
    System.out.println("Отполировал кузов");

  }
}
