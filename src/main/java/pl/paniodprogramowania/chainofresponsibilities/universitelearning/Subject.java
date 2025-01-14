package pl.paniodprogramowania.chainofresponsibilities.universitelearning;

public abstract class Subject {
  private Subject nextStep;

  public Subject(Subject nextStep) {
    this.nextStep = nextStep;
  }

  protected abstract void teach();

  public void performSemester() {
    this.teach();
    if (nextStep != null) {
      nextStep.performSemester();
    }
  }
}
