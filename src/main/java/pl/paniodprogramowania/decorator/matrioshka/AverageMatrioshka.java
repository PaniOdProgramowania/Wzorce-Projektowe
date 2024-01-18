package pl.paniodprogramowania.decorator.matrioshka;

public class AverageMatrioshka extends BaseMatrioshka {
  private BaseMatrioshka baseMatrioshka;

  public AverageMatrioshka(BaseMatrioshka baseMatrioshka) {
    this.baseMatrioshka = baseMatrioshka;
  }

  @Override
  public void uncover() {
    System.out.print("Average Matrioszka inside... ");
    this.baseMatrioshka.uncover();
  }
}
