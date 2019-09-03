package com.builder.vers1;

public class BuildWebSiteRunner {

  public static void main(String[] args) {
    Director director = new Director();
    director.setBuilder(new VisitCardWebsiteBuilder());

    WebSite webSite = director.buildWebSite();

    System.out.println(webSite);
  }

}
