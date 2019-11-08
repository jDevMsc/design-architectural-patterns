package com.gof.template_method.vers1;

public class WebSiteRunner {

  public static void main(String[] args) {
    WebSiteTemplate welcome = new WelcomePage();
    WebSiteTemplate news = new NewsPage();

    welcome.showPage();
    System.out.println("===================");
    news.showPage();
  }
}
