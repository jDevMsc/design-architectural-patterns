package com.gof.Adapter.vars1;

public class AdapterJavaToDatabase extends JavaApp implements Database {

  public void insert() {
    saveObject();
  }

  public void update() {
    updateeObject();
  }

  public void select() {
    saveObject();
  }

  public void remove() {
    deleteObject();
  }
}
