package com.gof.prototype.vers1;

public class ProjectFactory {

  Project project;

  public ProjectFactory(Project project) {
    this.project = project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

   Project cloneProject() {
    return (Project)project.copy();
   }
}
