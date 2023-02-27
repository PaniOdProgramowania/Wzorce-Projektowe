package pl.paniodprogramowania.strategy.challange.coffeeshop;

public final class DecaffeinatedCoffee implements Coffee {
  @Override
  public int giveEnergy() {
    System.out.println("No waking up effect after this coffee");
    return 0;
  }
}
