package pl.paniodprogramowania.strategy.pdf.dancer.solution;

public class Dancer {
  private Pirouette pirouette;

  public Dancer(Pirouette pirouette) {
    this.pirouette = pirouette;
  }

  public void dance() {
    System.out.println("I am dancing and making... "
        + this.pirouette.doPirouette() + " full pirouettes!");
  }
}
