package pl.paniodprogramowania.decorator.matrioshka;

public class GiganticMatrioshka extends BaseMatrioshka {
  private BaseMatrioshka baseMatrioshka;

  public GiganticMatrioshka(BaseMatrioshka baseMatrioshka) {
    this.baseMatrioshka = baseMatrioshka;
  }

  @Override
  public void uncover() {
    System.out.print("Gigantic Matrioszka inside... ");
    this.baseMatrioshka.uncover();
  }
}
