package pl.paniodprogramowania.strategy.challange.coffeeshop;

public final class Cappuccino implements Coffee{
  @Override
  public int giveEnergy() {
    System.out.println("Milk with coffee is good...");
    return 50;
  }
}
