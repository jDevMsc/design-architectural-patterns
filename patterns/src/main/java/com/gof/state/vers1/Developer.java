package com.gof.state.vers1;

public class Developer {

  Activity activity;

  public void chanmgeActivity() {
    if(activity instanceof Sleep) {
      setActivity(new Training());
    } else if(activity instanceof Training) {
      setActivity(new Coding());
    } else if(activity instanceof Coding) {
      setActivity(new Readinig());
    } else if( activity instanceof Readinig) {
      setActivity(new Sleep());
    }
  }

  public void justDoIt() {
    activity.justDoIt();
  }

  public void setActivity(Activity activity) {
    this.activity = activity;
  }
}
