package com.gof.visitor.vers1;

public class ProjectClass implements ProjectElement {

  @Override
  public void beWritten(Developer developer) {
    developer.create(this);
  }
}
