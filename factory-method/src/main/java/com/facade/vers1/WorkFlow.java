package com.facade.vers1;

public class WorkFlow {

  Developer developer = new Developer();
  Job job = new Job();
  BugTracker bugTracker = new BugTracker();

  public void solveProblems() {
    job.doJob();
    bugTracker.startSprint();
    developer.doJobBeforedeadline(bugTracker);
  }


}
