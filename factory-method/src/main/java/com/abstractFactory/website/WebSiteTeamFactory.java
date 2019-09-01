package com.abstractFactory.website;

import com.abstractFactory.DeveloperI;
import com.abstractFactory.ProjectManagerI;
import com.abstractFactory.ProjectTeamFactory;
import com.abstractFactory.TesterI;

public class WebSiteTeamFactory implements ProjectTeamFactory {

  public DeveloperI getDeveloper() {
    return new PhpDeveloper();
  }
  public TesterI getTester() {
    return new ManualTester();
  }
  public ProjectManagerI gerProjectManager() {
    return new WebSitePm();
  }
}
