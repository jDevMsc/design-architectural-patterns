package com.Decorator.vers1;

public class JavaTeamLead extends DeveloperDecorator {

  public JavaTeamLead(Developer developer) {
    super(developer);
  }

  public String sendWeekReport() {
    return "Sent week report tu customer";
  }

  @Override
  public String makeJava() {
    return super.makeJava() + sendWeekReport();
  }
}
