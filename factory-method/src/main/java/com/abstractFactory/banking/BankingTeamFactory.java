package com.abstractFactory.banking;

import com.abstractFactory.DeveloperI;
import com.abstractFactory.ProjectManagerI;
import com.abstractFactory.ProjectTeamFactory;
import com.abstractFactory.TesterI;

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
