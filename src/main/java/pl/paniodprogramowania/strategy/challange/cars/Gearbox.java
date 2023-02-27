package pl.paniodprogramowania.strategy.challange.cars;

public sealed interface Gearbox permits AutomaticGear, ManualGear{
  void run();
}
