package com.gof.interpreter.vers1;

public class PlusExpression implements Expression{

  Expression left;
  Expression right;

  public PlusExpression(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret() {
    return left.interpret() + right.interpret();
  }
}
