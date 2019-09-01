package com.abstractFactory.banking;

import com.abstractFactory.ProjectManagerI;

public class BankingPM implements ProjectManagerI {

  public void manageCode() {
    System.out.println("BankingPM manages banking project");
  }
}
