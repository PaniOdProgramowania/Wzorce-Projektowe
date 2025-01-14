package pl.paniodprogramowania.chainofresponsibilities.pasta;

public class KneadDough extends Process {
  public KneadDough(Process next) {
    super(next);
  }

  @Override
  protected void doOneStep() {
    System.out.println("Kneading the dough");
  }
}
