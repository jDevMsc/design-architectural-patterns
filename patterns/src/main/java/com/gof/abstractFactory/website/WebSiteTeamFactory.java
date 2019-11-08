package com.gof.abstractFactory.website;

import com.gof.abstractFactory.DeveloperI;
import com.gof.abstractFactory.ProjectManagerI;
import com.gof.abstractFactory.ProjectTeamFactory;
import com.gof.abstractFactory.TesterI;

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
