package pl.paniodprogramowania.decorator.christmastree.complex;

public class ChristmasTreeWithBalls extends ChristmasTreePlant{
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
    System.out.println("This tree is " + (living()? "living!" : "not living"));
    super.christmasPlant.look();
  }

  @Override
  public boolean living() {
    return christmasPlant.living();
  }
}
