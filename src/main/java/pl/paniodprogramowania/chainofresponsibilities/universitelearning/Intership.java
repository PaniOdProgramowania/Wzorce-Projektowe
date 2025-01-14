package pl.paniodprogramowania.chainofresponsibilities.universitelearning;

public class Intership extends Subject {
  public Intership(Subject nextStep) {
    super(nextStep);
  }

  @Override
  protected void teach() {
    System.out.println("that's an internship");
  }
}
