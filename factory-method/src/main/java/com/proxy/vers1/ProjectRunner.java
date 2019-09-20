package com.proxy.vers1;

public class ProjectRunner {

  public static void main(String[] args) {
    Project project = new ProxyProject("google.com");

    project.run();
  }
}
