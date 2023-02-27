package pl.paniodprogramowania.strategy.challange.chargers;

public class Runner {
  public static void main(String[] args) {
    Charger charger = new SmallBlackCharger();
    Laptop laptop = new Laptop(charger);
    laptop.charge();
  }
}
