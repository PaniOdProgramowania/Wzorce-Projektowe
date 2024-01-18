package pl.paniodprogramowania.decorator.matrioshka;

public class BigMatrioshka extends BaseMatrioshka {
  private BaseMatrioshka baseMatrioshka;

  public BigMatrioshka(BaseMatrioshka baseMatrioshka) {
    this.baseMatrioshka = baseMatrioshka;
  }

  @Override
  public void uncover() {
    System.out.print("Big Matrioszka inside... ");
    this.baseMatrioshka.uncover();
  }
}
