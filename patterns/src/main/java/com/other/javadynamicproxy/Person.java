package com.other.javadynamicproxy;

public class Person implements IPerson {
  private String name;

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
  this.name = name;
  }

  @Override
  public void rename(String newName) {
    if(!newName.equals(name)) {
      this.name = newName;
    }
  }
}
