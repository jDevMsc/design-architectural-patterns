package com.gof.facade.vers1;

public class Developer {

  public void doJobBeforedeadline(BugTracker bugTracker) {

    if( bugTracker.isActiveSprint()) {
      System.out.println("Developer is solving problems");
    } else {
      System.out.println("Developer is reading habraHabr");
    }

  }
}
