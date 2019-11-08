package com.gof.visitor.vers2;

public class VisitorApp {

  public static void main(String[] args) {
    Element body = new BodyElement();
    Element engine = new EngineElement();
    Visitor hooligan = new HooliganVisitor();
    Visitor mechanic = new GoodVisitor();

    body.accept(hooligan);
    engine.accept(hooligan);
  }

}
