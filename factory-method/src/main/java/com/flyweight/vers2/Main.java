package com.flyweight.vers2;

import java.util.Random;

public class Main {
  private static final String[] PLAYER = {"terrorist" ,"CounterTerroris" };
  private static final String[] WEAPON = {"Gun", "Knige", "cv-47", " Magnum"};


  public static void main(String[] args) {

    for (int i = 0; i < 10 ; i++) {
      Player player = PlayerFactory.getPlayer(getRandomPlayer());
      player.setWeapon(getRandomWeapon());
      player.showInformation();
    }

  }

  private static String getRandomPlayer() {
    Random random = new Random();
    int randomPlayer = random.nextInt(PLAYER.length);
    return PLAYER[randomPlayer];
  }

  private static String getRandomWeapon() {
    Random random = new Random();
    int randomWeapon = random.nextInt(WEAPON.length);
    return WEAPON[randomWeapon];
  }
}
