package com.gof.flyweight.vers1;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {

  private static final Map<String,Developer> developers = new HashMap<String,Developer>();

  public Developer getDeveloperBySpeciality(String spec) {
    Developer developer = developers.get(spec);

    if(developer == null) {
      if ("java".equals(spec)) {
        System.out.println("Hiring java Developer");
        developer = new JavaDeveloper();
      } else if ("c++".equals(spec)) {
        System.out.println("Hiring C++ developer");
        developer = new CppDeveloper();
      }
      developers.put(spec,developer);
    }
    return developer;
  }
}
