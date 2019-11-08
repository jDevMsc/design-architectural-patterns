package com.other.javadynamicproxy;

import java.lang.reflect.Proxy;

public class Main {

  public static void main(String[] args) {
    Person person = new Person();

    IPerson personProxy = (IPerson) Proxy.newProxyInstance(Person.class.getClassLoader(),
        Person.class.getInterfaces(),
        new NeverSleepingEye(person));

    personProxy.setName("Гриша");
    String nameIns = personProxy.getName();
    personProxy.rename("Вася");

    System.out.println(person.getName());

  }
}
