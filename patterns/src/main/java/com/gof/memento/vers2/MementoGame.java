package com.gof.memento.vers2;

public class MementoGame {

  public static void main(String[] args) {
  Game game = new Game();
  game.set("LVL1", 3000);
  System.out.println(game);

  File file = new File();
  file.setSave(game.save());

    game.set("LVL2", 55000);
    System.out.println(game);

    game.load(file.getSave());
    System.out.println(game);


  }
}
