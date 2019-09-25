package Memento.vers2;

public class Game {
  private String level;
  private int ms;

  public void set(String level, int ms) {
    this.level = level;
    this.ms = ms;
  }

  public void load(Save save) {
    this.level = save.getLevel();
    this.ms = save.getMs();
  }
  public Save save() {
    return new Save(level,ms);
  }

  @Override
  public String toString() {
    return "Game{" +
        "level='" + level + '\'' +
        ", ms=" + ms +
        '}';
  }
}
