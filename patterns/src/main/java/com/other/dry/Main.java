package com.other.dry;


import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Employyes> employyes = new ArrayList<>();
    employyes.add(new Employyes("John", 892684862));
    employyes.add(new Employyes("Mark", 891533485));
    employyes.add(new Employyes("Denis", 89648531));

    //повторяющиййся код выносим в отдельные методы
    System.out.println("Gibe me John number");
    getNumbers(employyes, "John");

    System.out.println("Gibe me Mark number");
    getNumbers(employyes, "Mark");


  }

  private static void getNumbers(List<Employyes> employyes, String s) {
    int number = 0;
    for (Employyes employee : employyes) {
      if (employee.getNamel() == s) {
        number = employee.getNumber();
      }
    }
    System.out.println(number);
  }
}
