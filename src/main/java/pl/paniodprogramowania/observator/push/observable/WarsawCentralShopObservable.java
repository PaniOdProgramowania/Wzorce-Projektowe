package pl.paniodprogramowania.observator.push.observable;

import java.util.List;
import pl.paniodprogramowania.observator.push.flowers.Flower;
import pl.paniodprogramowania.observator.push.observers.ObserverFloristShop;

public class WarsawCentralShopObservable implements ObservableFloristShop {
  private List<ObserverFloristShop> shops;

  public WarsawCentralShopObservable(List<ObserverFloristShop> shops) {
    this.shops = shops;
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
    for (ObserverFloristShop shop : shops) {
      shop.updateMainFlower(mainFlower);
    }
  }

}
