package Memento.vers1;

public class SaveProjectRunner {

  public static void main(String[] args) throws InterruptedException {
    Project project = new Project();
    GitHubRepositury repositury = new GitHubRepositury();

    System.out.println("Creating new project. Version 1.0");
    project.setVersionDate("Version 1.0");
    System.out.println(project);

    System.out.println("Save project to GitHub");
    repositury.setSave(project.save());

    System.out.println("Updating Project to version 1.1");

    System.out.println("Writing bad code...");
    Thread.sleep(5000);
    project.setVersionDate("Version 1.1");
    System.out.println(project);

    System.out.println("Somethong gone wrong...");
    System.out.println("RollingBack to version 1.0");
    project.load(repositury.getSave());

    System.out.println("Project after rollBac");
    System.out.println(project);

  }
}
