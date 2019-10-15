package com.gof.proxy.vers2;

public class RealImage implements Image {

  private String file;

  public RealImage(String file) {
    this.file = file;
    load();
  }

  @Override
  public void display() {
    System.out.println("See the file " + file);
  }

  public void load() {
    System.out.println("Loading files " + file);
  }
}
