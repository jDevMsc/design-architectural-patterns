package com.gof.prototype.vers2;

public class HumanFactory {

  Human human;

  public HumanFactory(Human human) {
    setPrototype(human);
  }

  public void setPrototype(Human human) {
    this.human = human;
  }

  Human makeCopy() {
    return (Human)human.copy();
  }
}
