package com.SOLID.DependencyInversion;

public class Client {
  DAO dataAccess = new DataAccess();

  public Client(DAO dataAccess) {
    this.dataAccess = dataAccess;
  }

  void dojob(){
    dataAccess.execute();
  }
}
