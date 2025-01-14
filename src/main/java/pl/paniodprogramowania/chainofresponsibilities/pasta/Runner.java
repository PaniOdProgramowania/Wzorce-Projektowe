package pl.paniodprogramowania.chainofresponsibilities.pasta;

public class Runner {
  public static void main(String[] args) {
    var pasta = new PourIngredients(
        new MixIngredients(
            new KneadDough(
                new RollDough(
                    new CutDough(null)
                )
            )
        )
    );
    pasta.makePasta();
  }
}
