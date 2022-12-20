package pl.paniodprogramowania.chainofresponsibilities;

public abstract class DumplingsPreparer {
  private DumplingsPreparer nextStep;

  public DumplingsPreparer(DumplingsPreparer nextStep) {
    this.nextStep = nextStep;
  }

  public void makeDumpling() {
    this.doStep();
    if (nextStep != null) {
      nextStep.makeDumpling();
    }
  }

  abstract protected void doStep();
}
