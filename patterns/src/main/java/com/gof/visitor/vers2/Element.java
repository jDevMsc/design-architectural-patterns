package com.gof.visitor.vers2;

//Элемент автозапчасть
public interface Element {

  void accept(Visitor visitor);
}
