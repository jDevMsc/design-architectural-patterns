package com.gof.factorymethod.vers2;

public class WindowsButton implements Button{

  public void render() {
    System.out.println("<button>Windows button render</button>");
    onClick();
  }

  public void onClick() {
    System.out.println("Click! from Window Button'");
  }
}
