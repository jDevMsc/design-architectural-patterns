package com.gof.factorymethod.vers2;

public class Demo {
  private static Factory factory;

  public static void main(String[] args) {
    configure();
    runBusinessLogic();
  }

  /**
   * В зависимости от окружения создаем определенную фабрику
   */
  static void configure() {
    if (System.getProperty("os.name").equals("Windows 10")) {
      factory = new WindowsFactory();
    } else {
      factory = new HtmlFactory();
    }
  }

  static void runBusinessLogic() {
    factory.renderWindow();
  }
}
