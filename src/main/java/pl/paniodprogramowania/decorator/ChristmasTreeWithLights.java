package pl.paniodprogramowania.decorator;

public class ChristmasTreeWithLights extends ChristmasTree{
  private ChristmasPlant christmasPlant;
  private int numberOfLights;

  public ChristmasTreeWithLights(ChristmasTree christmasPlant, int numberOfLights) {
    super(christmasPlant);
    this.christmasPlant = christmasPlant;
    this.numberOfLights = numberOfLights;
  }

  @Override
  public void look() {
    for (int i = 0; i < numberOfLights; i++) {
      System.out.println("light light!");
    }
    christmasPlant.look();
  }

  @Override
  public boolean living() {
    return christmasPlant.living();

  }
}
