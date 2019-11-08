package com.gof.singleton;

public class ProgramRuner  {

  public static void main(String[] args) {

    ProgramLogger programLogger = ProgramLogger.getProgramLogger();

    programLogger.addLogInfo("First log..");
    programLogger.addLogInfo("Second log..");
    programLogger.addLogInfo("Third log..");

    ProgramLogger programLogger2 = ProgramLogger.getProgramLogger();//всегда возвращается один и тот же объект


    programLogger2.showLogFile();




  }

}
