package com.Visitor.vers1;

public class Database implements ProjectElement {

  @Override
  public void beWritten(Developer developer) {
    developer.create(this);

  }
}