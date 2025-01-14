package pl.paniodprogramowania.chainofresponsibilities.dumplings;

public class FillingPreparer extends DumplingsPreparer {
  public FillingPreparer(DumplingsPreparer nextStep) {
    super(nextStep);
  }

  @Override
  public void doStep() {
    System.out.println("I am making the filling for ruskie pierogi: cheese + onion + potatoes!");
  }
}
