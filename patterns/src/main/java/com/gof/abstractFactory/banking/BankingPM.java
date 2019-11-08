package com.gof.abstractFactory.banking;

import com.gof.abstractFactory.ProjectManagerI;

public class BankingPM implements ProjectManagerI {

  public void manageCode() {
    System.out.println("BankingPM manages banking project");
  }
}
