package pl.paniodprogramowania.strategy.pdf.expat.solution;

public class Runner {
  public static void main(String[] args) {
    Expat expat = new Expat(new OnFootTravel());
    expat.goBackHomeForChristmas();
  }
}
