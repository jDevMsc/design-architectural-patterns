package com.builder.vers1;

public class EnterpriceWebSiteBuilder extends WebsiteBuilder {

  @Override
  void buildName() {
    webSite.setName("Enterprice webSite");
  }

  @Override
  void buildCms() {
    webSite.setCms(Cms.ALIFRESCO);
  }

  @Override
  void buildPrice() {
    webSite.setPrice(10000);
  }
}
