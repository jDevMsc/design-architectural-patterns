package com.gof.observer.vers1;

public interface Observed {

  public void addObsertver(Observer observer);

  public void removeObserver(Observer observer);

  public void notifyObservers();
}
