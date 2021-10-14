package pl.paniodprogramowania.observator.pull.observable;

import pl.paniodprogramowania.observator.pull.flowers.Flower;
import pl.paniodprogramowania.observator.pull.observers.ObserverFloristShop;

public interface ObservableFloristShop {

  void addShop(ObserverFloristShop floristShop);
  void removeShop(ObserverFloristShop floristShop);
  void setNewFlower(Flower mainFlower);
  Flower getUpToDateFlower();
}
