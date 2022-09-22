package pl.paniodprogramowania.decorator.makeup;

public class Fluid extends Face {
  private Face face;
  private String fluidBrand;

  public Fluid(String fluidBrand, Face face) {
    super();
    this.fluidBrand = fluidBrand;
    this.face = face;
  }

  @Override
  public String printFace() {
    face.printFace();
    return face.printFace() + " plus added " + fluidBrand + " fluid!";
  }
}
