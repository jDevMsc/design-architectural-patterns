package com.abstractFactory.website;

import com.abstractFactory.ProjectManagerI;

public class WebSitePm implements ProjectManagerI {

  public void manageCode() {
    System.out.println("WebSitePM manages web site project");
  }
}
