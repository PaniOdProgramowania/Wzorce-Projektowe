package pl.paniodprogramowania.decorator;

public abstract class ChristmasTree extends ChristmasPlant {
  ChristmasPlant christmasPlant;

  protected ChristmasTree(ChristmasPlant christmasPlant) {
    this.christmasPlant = christmasPlant;
  }
}
