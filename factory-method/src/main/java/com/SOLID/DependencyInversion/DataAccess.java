package com.SOLID.DependencyInversion;

public class DataAccess implements DAO {

  @Override
  public void execute() {
    System.out.println("Executing...");
  }
}
