package pl.paniodprogramowania.chainofresponsibilities.universitelearning;

public class Laboratory extends Subject {
  public Laboratory(Subject nextStep) {
    super(nextStep);
  }

  @Override
  protected void teach() {
    System.out.println("that's a lab");
  }
}
