package pl.paniodprogramowania.factory;

public class Runner {
  public static void main(String[] args) {
    PotFactory potFactory = new EarthenPotFactory();
    Pot pot = potFactory.create();
  }
}
