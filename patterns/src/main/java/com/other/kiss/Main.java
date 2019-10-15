package com.other.kiss;

public class Main {

  public static void main(String[] args) {
    try {
      System.out.println(weekDay(0));
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println(e.getMessage());
    }
  }

  private static String weekDay(int day) throws Exception {
    if ((day < 1) || (day > 7)) {
      throw new Exception("day must be in range 1 to 7");
    }
    String[] days = {"Monday", "Tuesday", "Wednasday", "Thursday", "Saturday", "Sunday"};
    return days[day - 1];
  }

  private static String weekDay2(int day) throws Exception {
    if (day > 0 && day < 9) {
      if(day==1) return "Monday";
      if(day==2) return "Tuesday";
      if(day==3) return "Wednasday";
      if(day==4) return "Thursday";
      if(day==5) return "Saturday";
      if(day==6) return "Sunday";
    }
    return "day must be in range 1 to 7";
  }

  private static String weekDay3(int day) throws Exception {

    switch(day) {
      case 0 :
        return "Mondat";
      case 1 :
        return "Tuesday";
      case 2 :
        return "Wednasday";
      case 3 :
        return "Thursday";
      case 4 :
        return "Friday";
      case 5 :
        return "Saturday";
      case 6 :
        return "Saunday";
        default:
          throw new Exception("day must be in range 1 to 7");
    }
  }
}
