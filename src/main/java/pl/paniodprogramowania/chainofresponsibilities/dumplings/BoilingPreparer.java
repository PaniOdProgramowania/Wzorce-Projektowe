package pl.paniodprogramowania.chainofresponsibilities.dumplings;

public class BoilingPreparer extends DumplingsPreparer {
  public BoilingPreparer(DumplingsPreparer nextStep) {
    super(nextStep);
  }

  @Override
  public void doStep() {
    System.out.println("And I am boiling the dumplings for 60 seconds!");
  }
}
