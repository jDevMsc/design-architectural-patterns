package com.gof.prototype.vers2;

public class Prototype {

  public static void main(String[] args) {
    Human original = new Human(18 , "Ivan");
    System.out.println(original);

    Human copy = (Human)original.copy();
    System.out.println(copy);

    HumanFactory humanFactory = new HumanFactory(copy);
    Human h1 = humanFactory.makeCopy();
    System.out.println(h1);

    humanFactory.setPrototype(new Human(30 , "Valeriy"));
    Human h2 = humanFactory.makeCopy();
    System.out.println(h2);


  }
}
