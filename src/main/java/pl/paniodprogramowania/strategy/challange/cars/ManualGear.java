package pl.paniodprogramowania.strategy.challange.cars;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public final class ManualGear implements Gearbox {
  @Override
  public void changeGear() {
    System.out.println("Manual Gear");
  }
}
