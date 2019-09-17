package com.Decorator.vers1;

public class DeveloperDecorator implements Developer {

  Developer developer;

  public DeveloperDecorator(Developer developer) {
    this.developer = developer;
  }

  public String makeJava() {
    return developer.makeJava();
  }
}
