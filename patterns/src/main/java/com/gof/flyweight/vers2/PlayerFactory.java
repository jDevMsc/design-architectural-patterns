package com.gof.flyweight.vers2;

import java.util.HashMap;

public class PlayerFactory {

  private static final HashMap<String, Player> players = new HashMap<String, Player>();


  public static Player getPlayer(String team) {
    Player player =  null;

    if(players.containsKey(team)) {
      player = players.get(team);
    }else {
      switch (team) {
        case "terrorist" :
          player = new Terrorist();
          System.out.println("Terrorist team cteated");
          break;
        case "CounterTerroris" :
          player = new CounterTerrorist();
          System.out.println("CounterTerroris team cteated");
          break;
          default:
            System.out.println("Spectator detected");
      }
    }
    players.put(team, player);
    return player;
  }
}
