package pl.paniodprogramowania.strategy.challange.pots;

public class Pot {
  private Flower flower;

  public Pot(Flower flower) {
    this.flower = flower;
  }

  public void plantAFlower(){
    System.out.println("This is the flower I have in my pot:");
    flower.bloom();
  }
}
