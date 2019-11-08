package com.gof.abstractFactory.website;

import com.gof.abstractFactory.ProjectManagerI;

public class WebSitePm implements ProjectManagerI {

  public void manageCode() {
    System.out.println("WebSitePM manages web site project");
  }
}
