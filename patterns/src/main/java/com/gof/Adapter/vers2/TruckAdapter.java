package com.gof.Adapter.vers2;

public class TruckAdapter implements Car{

  Track track;

  public TruckAdapter(Track track) {
    this.track = track;
  }


  public void wash() {
    track.clean();
  }
}
