package pl.paniodprogramowania.decorator.christmastree.complex;

public class ColouredTree extends ChristmasPlant {
  public ColouredTree(String colour) {
    this.colour = colour;
  }

  private final String colour;

  @Override
  public boolean living() {
    return true;
  }
}
