package pl.paniodprogramowania.observator.pull.observable;

import java.util.List;
import pl.paniodprogramowania.observator.pull.flowers.Flower;
import pl.paniodprogramowania.observator.pull.flowers.NoFlower;
import pl.paniodprogramowania.observator.pull.observers.ObserverFloristShop;

public class WarsawCentralShopObservable implements ObservableFloristShop {
  private List<ObserverFloristShop> shops;
  private Flower flower;

  public WarsawCentralShopObservable(List<ObserverFloristShop> shops) {
    this.shops = shops;
    this.flower = new NoFlower();
  }

  @Override
  public void addShop(ObserverFloristShop floristShop) {
    System.out.println("Added new floristShop from city " + floristShop.toString());
    shops.add(floristShop);
  }

  @Override
  public void removeShop(ObserverFloristShop floristShop) {
    System.out.println("Removed new floristShop from city" + floristShop.toString());
    shops.remove(floristShop);
  }

  @Override
  public void setNewFlower(Flower mainFlower) {
    System.out.println("New flower for the upcoming motnh will be: " + mainFlower.toString());
    this.flower = mainFlower;
    for (ObserverFloristShop shop : shops) {
      shop.updateMainFlower();
    }
  }

  @Override
  public Flower getUpToDateFlower() {
    return flower;
  }

}
