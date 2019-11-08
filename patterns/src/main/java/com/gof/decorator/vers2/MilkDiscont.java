package com.gof.decorator.vers2;

public class MilkDiscont extends Decorator {

  public MilkDiscont(Product product) {
    super(product);
  }

  public int getPrice() {
    return product.getPrice() - 15;
  }
}
