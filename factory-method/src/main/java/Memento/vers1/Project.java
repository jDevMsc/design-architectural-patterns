package Memento.vers1;

import java.util.Date;

public class Project {

  private String version;
  private Date date;

  public Save save(){
    return new Save(version);
  }

  public void load(Save save) {
    version = save.getVersion();
    date = save.getDate();
  }


  public void setVersionDate(String version) {
    this.version = version;
    this.date = new Date();
  }

  @Override
  public String toString() {
    return "\nProject:\n" +
        "Version:" + version +
        "\n Date:" + date + "\n";
  }
}
