package pl.paniodprogramowania.decorator.makeup;

public class Powder extends Face {
  private Face face;
  private String powderShade;

  public Powder(Face face, String powderShade) {
    super();
    this.face = face;
    this.powderShade = powderShade;
  }

  @Override
  public String printFace() {
    return face.printFace() + " plus added powder with shade " + powderShade;
  }
}
