package pl.paniodprogramowania.strategy.pdf.singer.solution;

public class Singer {
  private Sing sing;
  private String name;

  public Singer(Sing sing, String name) {
    this.sing = sing;
    this.name = name;
  }

  public void performOnStage(){
    System.out.println("Singer " + this.name + " is singing... ");
    this.sing.sing();
  }
}
