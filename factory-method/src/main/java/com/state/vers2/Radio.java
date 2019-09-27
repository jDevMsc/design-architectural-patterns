package com.state.vers2;

public class Radio {
Station station;

  public void setStation(Station station) {
    this.station = station;
  }

  void nextStation() {
    if (station instanceof Radio7) {
      setStation(new RadioDFM());
    } else if (station instanceof RadioDFM) {
      setStation(new VestiFm());
    }else  if(station instanceof VestiFm) {
      setStation(new Radio7());
    }
  }

  void play() {
    station.play();
  }


}
