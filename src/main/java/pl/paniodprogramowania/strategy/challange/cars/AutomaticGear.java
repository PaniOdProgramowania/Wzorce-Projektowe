package pl.paniodprogramowania.strategy.challange.cars;

public final class AutomaticGear implements Gearbox {
  @Override
  public void run() {
    System.out.println("Automatic Gear!!");
  }
}
