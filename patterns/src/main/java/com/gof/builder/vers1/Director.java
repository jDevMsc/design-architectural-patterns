package com.gof.builder.vers1;

public class Director {

  WebsiteBuilder builder;

  public void setBuilder(WebsiteBuilder builder) {
    this.builder = builder;
  }

  WebSite buildWebSite() {
    builder.createWebSite();
    builder.buildName();
    builder.buildCms();
    builder.buildPrice();

    WebSite webSite = builder.getWebSite();

    return webSite;
  }
}
