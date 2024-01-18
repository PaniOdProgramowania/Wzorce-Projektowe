package pl.paniodprogramowania.strategy.challange.cars;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public final class AutomaticGear implements Gearbox {
  @Override
  public void changeGear() {
    System.out.println("Automatic Gear!!");
  }
}
