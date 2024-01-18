package pl.paniodprogramowania.decorator.matrioshka;

public class SmallMatrioshka extends BaseMatrioshka {
  private BaseMatrioshka baseMatrioshka;

  public SmallMatrioshka(BaseMatrioshka baseMatrioshka) {
    this.baseMatrioshka = baseMatrioshka;
  }

  @Override
  public void uncover() {
    System.out.print("Small Matrioszka inside... ");
    this.baseMatrioshka.uncover();
  }
}
