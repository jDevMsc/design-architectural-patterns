package com.factorymethod.vers1;

public class CppDeveloperFactory implements DeveloperFactory {

  public Developer createDeveloper() {
    return new CppDeveloper();
  }
}
