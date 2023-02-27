package pl.paniodprogramowania.strategy.challange.coffeeshop;

public final class BlackStrongCoffee implements Coffee{
  @Override
  public int giveEnergy() {
    System.out.println("Strong black coffee always works best!");
    return 100;
  }
}
