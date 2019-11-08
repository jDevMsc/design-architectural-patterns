package com.other.solid.DependencyInversion;

public class Client {
  DAO dataAccess = new DataAccess();

  public Client(DAO dataAccess) {
    this.dataAccess = dataAccess;
  }

  void dojob(){
    dataAccess.execute();
  }
}
