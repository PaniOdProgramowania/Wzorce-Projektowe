package pl.paniodprogramowania.decorator.christmastree.simpler;

import pl.paniodprogramowania.decorator.christmastree.simpler.ChristmasTree;

public class ChristmasTreeWithLights extends ChristmasTree {
  private ChristmasTree christmasTree;
  private int numberOfLights;

  public ChristmasTreeWithLights(ChristmasTree christmasPlant, int numberOfLights) {
    this.christmasTree = christmasPlant;
    this.numberOfLights = numberOfLights;
  }

  @Override
  public void look() {
    for (int i = 0; i < numberOfLights; i++) {
      System.out.println("light light!");
    }
    christmasTree.look();
  }
}
