package com.gof.builder.vers1;

public abstract class WebsiteBuilder {

    WebSite webSite;

    void createWebSite () {
      webSite = new WebSite();
    }
    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

  WebSite getWebSite() {
    return  webSite;
  }
}
