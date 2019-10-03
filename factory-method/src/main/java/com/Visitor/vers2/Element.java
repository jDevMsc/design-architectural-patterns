package com.Visitor.vers2;

//Элемент автозапчасть
public interface Element {

  void accept(Visitor visitor);
}
