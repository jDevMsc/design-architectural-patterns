package com.Visitor.vers1;

public class Test implements ProjectElement {

  @Override
  public void beWritten(Developer developer) {
    developer.create(this);

  }
}