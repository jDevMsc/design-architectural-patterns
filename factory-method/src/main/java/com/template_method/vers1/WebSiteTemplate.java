package com.template_method.vers1;

public abstract class WebSiteTemplate {

  public void showPage() {
    System.out.println("Header");
    showPageContent();
    System.out.println("Footer");
  }
  public abstract void showPageContent();
}
