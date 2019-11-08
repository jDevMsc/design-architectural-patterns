package com.gof.abstractFactory;

import com.gof.abstractFactory.banking.BankingTeamFactory;

/**
 * Создание интерфейса, для создания множества взаимозвязаннхых и взаимозависимых объектов,
 * без жесткой привязки к конкретным классам
 *
 * - система не должна зависеть от метода создания, компановки
 * - входящие взим объекты должны использоваться вместе
 * - система должна конфигурироваться одним из множдества объектов
 * - нам необходимо предоставить множество объектов раскрывая их инттерфейсы но не реализацию
 */
public class SuperBankSystem {

  public static void main(String[] args) {
    ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
    DeveloperI developerI = projectTeamFactory.getDeveloper();
    TesterI testerI = projectTeamFactory.getTester();
    ProjectManagerI projectManagerI = projectTeamFactory.gerProjectManager();

    System.out.println("Create bank Ssytem");
    developerI.witeCode();
    testerI.testCode();
    projectManagerI.manageCode();

  }
}
