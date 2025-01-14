package pl.paniodprogramowania.chainofresponsibilities.pasta;

public class RollDough extends Process {
  public RollDough(Process next) {
    super(next);
  }

  @Override
  protected void doOneStep() {
    System.out.println("Rolling the dough");
  }
}
