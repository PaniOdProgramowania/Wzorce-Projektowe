package pl.paniodprogramowania.decorator.matrioshka;

public class Runner {
  public static void main(String[] args) {
    var matrioshka = new GiganticMatrioshka(
        new BigMatrioshka(
            new AverageMatrioshka(
                new SmallMatrioshka(
                    new BaseMatrioshka()
                )
            )
        )
    );
    matrioshka.uncover();
  }
}
