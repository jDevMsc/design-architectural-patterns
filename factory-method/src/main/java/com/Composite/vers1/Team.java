package com.Composite.vers1;

import java.util.ArrayList;
import java.util.List;

public class Team {

  private List<Developer> list = new ArrayList<Developer>();

  public void addDeveloper(Developer developer) {
    list.add(developer);
  }

  public void removeDeveloper(Developer developer) {
    list.remove(developer);
  }

  public void createProject() {
    System.out.println("Team Create Project");
    for(Developer developer : list) {
      developer.writeCode();
    }
  }
}
