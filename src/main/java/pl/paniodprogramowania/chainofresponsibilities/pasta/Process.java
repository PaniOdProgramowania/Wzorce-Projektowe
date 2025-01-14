package pl.paniodprogramowania.chainofresponsibilities.pasta;

public abstract class Process {
  private Process next;

  public Process(Process next) {
    this.next = next;
  }

  public void makePasta() {
    this.doOneStep();
    if (next != null) {
      next.makePasta();
    }
  }

  protected abstract void doOneStep();

}
