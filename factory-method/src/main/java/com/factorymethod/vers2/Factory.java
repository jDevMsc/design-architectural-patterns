package com.factorymethod.vers2;

public abstract class Factory {

  public void renderWindow() {
    Button okButton = createButton();
    okButton.render();
  }
  public abstract Button createButton();
}
