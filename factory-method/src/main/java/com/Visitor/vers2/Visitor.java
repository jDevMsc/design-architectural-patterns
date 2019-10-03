package com.Visitor.vers2;

public interface Visitor {
  void visit(EngineElement engineElement);
  void visit(BodyElement engineElement);
}
