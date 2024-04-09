package pl.paniodprogramowania.strategy.pdf.teashop.solution;

public class Runner {
  public static void main(String[] args) {
    TeaEnthusiast teaEnthusiast = new TeaEnthusiast(new WhiteTea());
    teaEnthusiast.drinkTea();
  }
}
