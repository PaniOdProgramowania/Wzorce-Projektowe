package pl.paniodprogramowania.strategy.pdf.dancer.solution;

public class Runner {
  public static void main(String[] args) {
    Dancer maria = new Dancer(new SkilledPirouettes());
    maria.dance();
  }
}
