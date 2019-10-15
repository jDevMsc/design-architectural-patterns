package com.gof.visitor.vers1;

public interface Developer {

  public void create(ProjectClass projectClass);
  public void create(Database database);
  public void create( Test test);
}
