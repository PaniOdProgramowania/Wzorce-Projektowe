package pl.paniodprogramowania.chainofresponsibilities.dumplings;

public class Runner {
  public static void main(String[] args) {
    DumplingsPreparer dumplingsPreparer =
        new FillingPreparer(
            new DoughPreparer(
                new CuttingPreparer(
                    new ShapePreparer(
                        new BoilingPreparer(
                            null
                        )
                    )
                )
            )
        );

    dumplingsPreparer.makeDumpling();
  }
}
