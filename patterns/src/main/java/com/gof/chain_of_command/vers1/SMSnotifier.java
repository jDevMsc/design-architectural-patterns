package com.gof.chain_of_command.vers1;

public class SMSnotifier extends  Notifier{

  public SMSnotifier(int priority) {
    super(priority);
  }

  @Override
  public void write(String message) {
    System.out.println("Sending SMS to manager: "  + message);
  }
}
