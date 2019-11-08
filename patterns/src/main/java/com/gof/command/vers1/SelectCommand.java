package com.gof.command.vers1;

public class SelectCommand implements Command {
  Database database;

  public SelectCommand(Database database) {
    this.database = database;
  }
  @Override
  public void execute() {
  database.select();
  }
}
