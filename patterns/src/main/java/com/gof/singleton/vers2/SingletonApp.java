package com.gof.singleton.vers2;

public class SingletonApp {

  public static void main(String[] args) throws InterruptedException {
    Singleton[] array = new Singleton[1000];
    Thread[] t = new Thread[1000];

    for (int i = 0; i < 1000; i++) {
      t[i] = new Thread(new ThreadTest());
      t[i].start();
    }

    for (int i = 0; i < 1000; i++) {
      t[i].join();
    }

    System.out.println(Singleton.counter);


  }
}
