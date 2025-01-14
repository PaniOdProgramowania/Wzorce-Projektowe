package pl.paniodprogramowania.chainofresponsibilities.pasta;

public class PourIngredients extends Process {
  public PourIngredients(Process next) {
    super(next);
  }

  @Override
  protected void doOneStep() {
    System.out.println("Puring ingredients");
  }
}
