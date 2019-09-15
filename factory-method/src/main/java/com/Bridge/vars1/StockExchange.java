package com.Bridge.vars1;

public class StockExchange  extends Program {

  public StockExchange(Developer developer) {
    super(developer);
  }

  @Override
  public void developProgram() {
    System.out.println("StockExchange develpment in progress...");
    developer.writeCode();
  }
}
