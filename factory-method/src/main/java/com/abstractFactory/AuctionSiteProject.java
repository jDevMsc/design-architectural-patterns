package com.abstractFactory;
/**
 * Создание интерфейса, для создания множества взаимозвязаннхых и взаимозависимых объектов,
 * без жесткой привязки к конкретным классам
 *
 * - система не должна зависеть от метода создания, компановки
 * - входящие взим объекты должны использоваться вместе
 * - система должна конфигурироваться одним из множдества объектов
 * - нам необходимо предоставить множество объектов раскрывая их инттерфейсы но не реализацию
 */
import com.abstractFactory.website.WebSiteTeamFactory;
public class AuctionSiteProject {

  public static void main(String[] args) {
    ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
    DeveloperI developer = projectTeamFactory.getDeveloper();
    TesterI tester = projectTeamFactory.getTester();
    ProjectManagerI projectManager = projectTeamFactory.gerProjectManager();

    System.out.println("Creating WebSite");
    developer.witeCode();
    tester.testCode();
    projectManager.manageCode();
  }

}
