package pl.paniodprogramowania.chainofresponsibilities.pasta;

public class CutDough extends Process {
  public CutDough(Process next) {
    super(next);
  }

  @Override
  protected void doOneStep() {
    System.out.println("Cutting the dough");
  }
}
