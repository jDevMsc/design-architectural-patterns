package com.chain_of_command.vers1;

public class BugTracker {

  public static void main(String[] args) {
    Notifier reportNotifier = new SimpeReportNotifier(Priority.ROUTINE);
    Notifier emeil = new EmailNotifier(Priority.IMOPRTANT);
    Notifier sms = new SMSnotifier(Priority.ASAP);

    reportNotifier.setNextNotifier(emeil);
    emeil.setNextNotifier(sms);

    reportNotifier.notifyManager("Everything is ok", Priority.ROUTINE);
    reportNotifier.notifyManager("Something went wrong", Priority.IMOPRTANT);
    reportNotifier.notifyManager("Huston we have a problem", Priority.ASAP);
  }
}
