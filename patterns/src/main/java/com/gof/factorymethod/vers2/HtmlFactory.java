package com.gof.factorymethod.vers2;

public class HtmlFactory extends Factory {

  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}
