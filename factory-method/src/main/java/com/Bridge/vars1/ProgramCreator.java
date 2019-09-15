package com.Bridge.vars1;



public class ProgramCreator {

  public static void main(String[] args) {
    Program[] programs = {
      new BankSystem(new JavaDeveloper()),
      new StockExchange(new CppDeveloper())
    };

    for(Program program : programs) {
      program.developProgram();
    }
  }
}
