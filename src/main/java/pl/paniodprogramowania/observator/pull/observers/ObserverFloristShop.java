package pl.paniodprogramowania.observator.pull.observers;

import pl.paniodprogramowania.observator.pull.flowers.Flower;
import pl.paniodprogramowania.observator.pull.flowers.NoFlower;
import pl.paniodprogramowania.observator.pull.observable.ObservableFloristShop;

public abstract class ObserverFloristShop {
  final ObservableFloristShop observableFloristShop;
  Flower flowerForTheMonth;

  protected ObserverFloristShop(ObservableFloristShop observableFloristShop) {
    this.observableFloristShop = observableFloristShop;
    this.flowerForTheMonth = new NoFlower();
    observableFloristShop.addShop(this);
  }

  public abstract void updateMainFlower();
}
