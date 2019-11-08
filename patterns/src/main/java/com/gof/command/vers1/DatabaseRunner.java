package com.gof.command.vers1;

public class DatabaseRunner {

  public static void main(String[] args) {
  Database database = new Database();
  Developer developer = new Developer(new InsertCommand(database),new SelectCommand(database),
      new UpdateCommand(database), new DeleteCommand(database));

  developer.insertRecord();
  developer.updateRecord();
  developer.selectRecord();
  developer.deleteRecord();

  }
}
