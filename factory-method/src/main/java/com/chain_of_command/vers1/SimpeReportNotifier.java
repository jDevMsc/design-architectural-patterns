package com.chain_of_command.vers1;

public class SimpeReportNotifier extends Notifier{

  public SimpeReportNotifier(int priority) {
    super(priority);
  }

  @Override
  public void write(String message) {
    System.out.println("Notifier useing simple report: " + message);
  }
}
