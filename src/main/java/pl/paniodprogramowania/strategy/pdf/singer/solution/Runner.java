package pl.paniodprogramowania.strategy.pdf.singer.solution;

public class Runner{
  public static void main(String[] args) {
    Singer singer = new Singer(new SingOutOfTone(), "BadSinger");
    singer.performOnStage();
  }
}
