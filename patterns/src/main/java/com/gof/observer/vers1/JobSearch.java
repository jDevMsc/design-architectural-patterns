package com.gof.observer.vers1;

public class JobSearch {

  public static void main(String[] args) {
    JavaDeveloperJobSite site = new JavaDeveloperJobSite();
    site.addVacancy("First Java position");
    site.addVacancy("Second Java position");

    Observer fistSubscriber = new Subscriber("Artem");
    Observer secondSubscriber = new Subscriber("Peter");

    site.addObsertver(fistSubscriber);
    site.addObsertver(secondSubscriber);

    site.addVacancy("Third Java position");
    site.removeVacancy("First Java position");
  }
}
