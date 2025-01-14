package pl.paniodprogramowania.chainofresponsibilities.pasta;

public class MixIngredients extends Process {
  public MixIngredients(Process next) {
    super(next);
  }

  @Override
  protected void doOneStep() {
    System.out.println("Mixing ingredients");
  }
}
