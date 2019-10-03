package com.Visitor.vers1;

public class ProjectRunner {

  public static void main(String[] args) {
    Project project = new Project();
    Developer junior = new JunioeDeveloper();
    Developer seniour = new SeniorDeveloper();

    System.out.println("Junior In Action...");
    project.beWritten(junior);

    System.out.println("=================");

    System.out.println("Seniour In Action...");
    project.beWritten(seniour);

  }



}
