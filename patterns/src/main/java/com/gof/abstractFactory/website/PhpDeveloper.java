package com.gof.abstractFactory.website;

import com.gof.abstractFactory.DeveloperI;

public class PhpDeveloper implements DeveloperI {

  public void witeCode() {
    System.out.println("PHPDeveloper writes php code");
  }
}
