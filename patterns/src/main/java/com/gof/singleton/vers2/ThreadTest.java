package com.gof.singleton.vers2;

public class ThreadTest implements  Runnable {

  @Override
  public void run() {
    Singleton.getInstance();
  }
}
