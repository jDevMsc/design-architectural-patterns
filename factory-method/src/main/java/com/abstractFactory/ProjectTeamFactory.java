package com.abstractFactory;

public interface ProjectTeamFactory {

  DeveloperI getDeveloper();
  TesterI getTester();
  ProjectManagerI gerProjectManager();

}
