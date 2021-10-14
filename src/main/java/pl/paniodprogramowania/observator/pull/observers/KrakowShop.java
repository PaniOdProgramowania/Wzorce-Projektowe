package pl.paniodprogramowania.observator.pull.observers;

import pl.paniodprogramowania.observator.pull.flowers.Flower;
import pl.paniodprogramowania.observator.pull.observable.ObservableFloristShop;

public class KrakowShop extends ObserverFloristShop {

  public KrakowShop(ObservableFloristShop observableFloristShop) {
    super(observableFloristShop);
  }

  @Override
  public void updateMainFlower() {
    Flower newFlower = this.observableFloristShop.getUpToDateFlower();
    this.flowerForTheMonth = newFlower;
    System.out.println("Updated new flower to " + newFlower.toString() + " in Krakow.");
  }

  @Override
  public String toString() {
    return "Kraków";
  }

}
