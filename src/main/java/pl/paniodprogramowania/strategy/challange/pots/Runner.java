package pl.paniodprogramowania.strategy.challange.pots;

public class Runner {

  public static void main(String[] args) {
    Flower rose = new Rose();
    Pot pot = new Pot(rose);
    pot.plantAFlower();
  }
}
