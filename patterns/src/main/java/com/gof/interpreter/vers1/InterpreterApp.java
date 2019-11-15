package com.gof.interpreter.vers1;

public class InterpreterApp {

  public static void main(String[] args) {
    //1-2+3
    Context context = new Context();
    Expression expression = context.evaluate("1+2+3");
    System.out.println(expression.interpret());
  }
}
