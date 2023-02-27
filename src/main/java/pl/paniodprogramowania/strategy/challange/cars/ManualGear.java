package pl.paniodprogramowania.strategy.challange.cars;

public final class ManualGear implements Gearbox{
  @Override
  public void run() {
    System.out.println("Manual Gear");
  }
}
