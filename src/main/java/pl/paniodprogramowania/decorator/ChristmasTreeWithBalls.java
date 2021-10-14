package pl.paniodprogramowania.decorator;

public class ChristmasTreeWithBalls extends ChristmasTree{
  private int numberOfXmasBalls;

  public ChristmasTreeWithBalls(ChristmasPlant christmasPlant, int numberOfXmasBalls) {
    super(christmasPlant);
    this.numberOfXmasBalls = numberOfXmasBalls;
  }

  @Override
  public void look() {
    for (int i = 0; i < numberOfXmasBalls; i++){
      System.out.println("Ball nr " + i + " on the xmas tree!");
    }
    this.christmasPlant.look();
  }

  @Override
  public boolean living() {
    return christmasPlant.living();
  }
}
