package com.gof.interpreter.vers1;

public class NumberExpression implements Expression {

  int number;

  public NumberExpression(int number) {
    this.number = number;
  }
  public int interpret() {
    return number;
  }
}
