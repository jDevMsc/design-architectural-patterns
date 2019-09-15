package com.Bridge.vars1;

public class BankSystem extends Program {

  public BankSystem(Developer developer) {
    super(developer);
  }

  @Override
  public void developProgram() {
    System.out.println("BankSystem develpment in progress...");
    developer.writeCode();
  }
}
