package com.gof.builder.vers1;

public class VisitCardWebsiteBuilder  extends WebsiteBuilder{

  @Override
  void buildName() {
    webSite.setName("Visit Card");
  }

  @Override
  void buildCms() {
    webSite.setCms(Cms.WORDPRESS);
  }

  @Override
  void buildPrice() {
    webSite.setPrice(500);
  }
}
