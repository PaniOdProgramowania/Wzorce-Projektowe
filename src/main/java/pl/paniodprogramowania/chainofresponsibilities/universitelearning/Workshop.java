package pl.paniodprogramowania.chainofresponsibilities.universitelearning;

public class Workshop extends Subject {
  public Workshop(Subject nextStep) {
    super(nextStep);
  }

  @Override
  protected void teach() {
    System.out.println("that's a workshop");
  }
}
