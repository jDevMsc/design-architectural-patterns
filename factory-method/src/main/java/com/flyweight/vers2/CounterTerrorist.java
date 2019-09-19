package com.flyweight.vers2;

public class CounterTerrorist implements Player {
  private static final String MISSION = "defuse the bomb";

  private String weapon;

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  public void showInformation() {
    System.out.println("Player CounterTerrorist added; Weapon = " + weapon + " Mission = " + MISSION);

  }
}
