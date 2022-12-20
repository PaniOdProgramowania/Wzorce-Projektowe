package pl.paniodprogramowania.chainofresponsibilities;

public class DoughPreparer extends DumplingsPreparer {

  public DoughPreparer(DumplingsPreparer nextStep) {
    super(nextStep);
  }

  @Override
  public void doStep() {
    System.out.println("I am preparing the dough: mixing flour with water and oil!");
  }
}
