package com.gof.abstractFactory;

import com.gof.abstractFactory.website.WebSiteTeamFactory;
public class AuctionSiteProject {

  public static void main(String[] args) {
    ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
    DeveloperI developer = projectTeamFactory.getDeveloper();
    TesterI tester = projectTeamFactory.getTester();
    ProjectManagerI projectManager = projectTeamFactory.gerProjectManager();

    System.out.println("Creating WebSite");
    developer.witeCode();
    tester.testCode();
    projectManager.manageCode();
  }

}
