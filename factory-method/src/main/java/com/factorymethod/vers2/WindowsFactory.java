package com.factorymethod.vers2;

public class WindowsFactory extends Factory {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
