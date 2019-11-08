package com.gof.flyweight.vers2;

public class Terrorist implements Player{

  private static final String MISSION = "plant a bomb";
  private String weapon;

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  public void showInformation() {
    System.out.println("Player Terrorist added; Weapon = " + weapon + " Mission = " + MISSION);
  }
}
