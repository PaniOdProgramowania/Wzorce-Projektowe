package pl.paniodprogramowania.chainofresponsibilities;

public class CuttingPreparer extends DumplingsPreparer {
  public CuttingPreparer(DumplingsPreparer nextStep) {
    super(nextStep);
  }

  @Override
  public void doStep() {
    System.out.println("I am cutting the dough in circles!");
  }
}
