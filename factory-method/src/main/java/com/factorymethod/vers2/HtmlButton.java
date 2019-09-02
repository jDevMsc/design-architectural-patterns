package com.factorymethod.vers2;

public class HtmlButton implements Button {

  public void render() {
    System.out.println("<button>Html button render</button>");
    onClick();
  }

  public void onClick() {
    System.out.println("Click! from Html button'");
  }
}
