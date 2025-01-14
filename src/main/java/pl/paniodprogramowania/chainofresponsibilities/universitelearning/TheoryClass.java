package pl.paniodprogramowania.chainofresponsibilities.universitelearning;

public class TheoryClass extends Subject {
  public TheoryClass(Subject nextStep) {
    super(nextStep);
  }

  @Override
  protected void teach() {
    System.out.println("that's a theory class");
  }
}
