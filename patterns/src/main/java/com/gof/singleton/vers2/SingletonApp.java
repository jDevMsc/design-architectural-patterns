package com.gof.singleton.vers2;

public class SingletonApp {

  public static void main(String[] args) {
    Singleton s = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    Singleton s3 = Singleton.getInstance();
    System.out.println(s3.counter);
  }
}
