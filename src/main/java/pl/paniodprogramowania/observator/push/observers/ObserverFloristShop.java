package pl.paniodprogramowania.observator.push.observers;

import pl.paniodprogramowania.observator.push.flowers.Flower;
import pl.paniodprogramowania.observator.push.flowers.NoFlower;

public abstract class ObserverFloristShop {
  Flower flowerForTheMonth = new NoFlower();

  public abstract void updateMainFlower(Flower flower);
}
