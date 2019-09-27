package com.state.vers2;

public class StateApp {

  public static void main(String[] args) {
    Station station = new Radio7();
    Radio radio1 = new Radio();

    radio1.setStation(station);

    for (int i = 0; i < 5; i++) {
      radio1.play();
      radio1.nextStation();
    }
  }
}
