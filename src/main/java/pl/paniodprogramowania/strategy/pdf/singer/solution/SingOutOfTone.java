package pl.paniodprogramowania.strategy.pdf.singer.solution;

public class SingOutOfTone implements Sing{
  @Override
  public void sing() {
    System.out.println("you'd better stop.");
  }
}
