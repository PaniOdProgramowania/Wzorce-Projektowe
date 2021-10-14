package pl.paniodprogramowania.observator.pull.observers;

import pl.paniodprogramowania.observator.pull.flowers.Flower;
import pl.paniodprogramowania.observator.pull.observable.ObservableFloristShop;

public class GdanskShop extends ObserverFloristShop {

  public GdanskShop(ObservableFloristShop observableFloristShop) {
    super(observableFloristShop);
  }

  @Override
  public void updateMainFlower() {
    Flower newFlower = this.observableFloristShop.getUpToDateFlower();
    this.flowerForTheMonth = newFlower;
    System.out.println("Updated new flower to " + newFlower.toString() + " in Gdansk.");
  }

  @Override
  public String toString() {
    return "Kraków";
  }

}
