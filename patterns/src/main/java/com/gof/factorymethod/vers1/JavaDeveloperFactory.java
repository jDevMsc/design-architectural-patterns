package com.gof.factorymethod.vers1;

public class JavaDeveloperFactory implements DeveloperFactory {

  public Developer createDeveloper() {
    return new JavaDeveloper();
  }
}
