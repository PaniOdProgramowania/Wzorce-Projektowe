package pl.paniodprogramowania.observator.push.observable;

import pl.paniodprogramowania.observator.push.flowers.Flower;
import pl.paniodprogramowania.observator.push.observers.ObserverFloristShop;

public interface ObservableFloristShop {

  void addShop(ObserverFloristShop floristShop);
  void removeShop(ObserverFloristShop floristShop);
  void setNewFlower(Flower mainFlower);
}
