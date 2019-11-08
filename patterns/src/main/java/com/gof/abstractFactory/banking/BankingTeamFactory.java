package com.gof.abstractFactory.banking;

import com.gof.abstractFactory.DeveloperI;
import com.gof.abstractFactory.ProjectManagerI;
import com.gof.abstractFactory.ProjectTeamFactory;
import com.gof.abstractFactory.TesterI;

public class BankingTeamFactory implements ProjectTeamFactory {

  public DeveloperI getDeveloper() {
    return new JavaDeveloper();
  }

  public TesterI getTester() {
    return new QATester();
  }

  public ProjectManagerI gerProjectManager() {
    return new BankingPM();
  }
}
