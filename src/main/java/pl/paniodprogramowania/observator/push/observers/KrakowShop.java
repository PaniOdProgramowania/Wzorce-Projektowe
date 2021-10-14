package pl.paniodprogramowania.observator.push.observers;

import pl.paniodprogramowania.observator.push.flowers.Flower;

public class KrakowShop extends ObserverFloristShop{

  @Override
  public void updateMainFlower(Flower flower) {
    this.flowerForTheMonth = flower;
    System.out.println("Updated new flower to " + flower.toString() + " in Krakow.");
  }

  @Override
  public String toString() {
    return "Kraków";
  }
}
