package com.gof.factorymethod.vers1;
/**
 * Порождающий	паттерн	проектирования,
 * который	определяет	общий	интерфейс	для	создания	объектов	в
 * суперклассе,	позволяя	подклассам	изменять	тип	создаваемых	объектов
 */
public class Program {
  public static void main(String[] args) {
    DeveloperFactory developerFactory = createDeveloperBySpec("java");
    Developer developer = developerFactory.createDeveloper();
    developer.writeCode();
  }
  /**
   *   Приложение создает определенныую фабрику в зависимости от выбора пользователя,
   *   кофигурации или окружения
   */
  static DeveloperFactory createDeveloperBySpec(String spec) {
    if (spec.equalsIgnoreCase("java")) {
          return new JavaDeveloperFactory();
    } else if(spec.equalsIgnoreCase("c++")) {
      return new CppDeveloperFactory();
    } else{
       throw new RuntimeException("Speciality is unknown");
    }
  }


}
