package com.gof.prototype.vers1;

public class VersionControlRunner {

  public static void main(String[] args) {
    Project master = new Project(1,"SuperProject", "SourceCode sourceCode = new SourceCode();");

    System.out.println(master);

    //vers1
//    Project masterClone = (Project) master.copy();
    ProjectFactory factory = new ProjectFactory(master);
    Project masterClone = factory.cloneProject();
    System.out.println("=============");

    System.out.println(masterClone);
  }

}
