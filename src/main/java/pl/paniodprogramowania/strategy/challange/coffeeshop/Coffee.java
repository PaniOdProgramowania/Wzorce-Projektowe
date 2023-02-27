package pl.paniodprogramowania.strategy.challange.coffeeshop;

public sealed interface Coffee permits BlackStrongCoffee, Cappuccino, DecaffeinatedCoffee{
  int giveEnergy();
}
