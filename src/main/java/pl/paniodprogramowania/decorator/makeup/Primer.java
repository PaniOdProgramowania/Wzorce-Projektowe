package pl.paniodprogramowania.decorator.makeup;

public class Primer extends Face {
  private Face face;
  private double transparency;

  public Primer(double transparency, Face face) {
    super();
    this.face = face;
    this.transparency = transparency;
  }

  @Override
  public String printFace() {
    return face.printFace() + "** plus added primer with transparency " + transparency + " ** ";
  }
}
