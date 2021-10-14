package pl.paniodprogramowania.observator.pull;

import java.util.ArrayList;
import pl.paniodprogramowania.observator.pull.flowers.Rose;
import pl.paniodprogramowania.observator.pull.flowers.Tulip;
import pl.paniodprogramowania.observator.pull.observable.ObservableFloristShop;
import pl.paniodprogramowania.observator.pull.observable.WarsawCentralShopObservable;
import pl.paniodprogramowania.observator.pull.observers.GdanskShop;
import pl.paniodprogramowania.observator.pull.observers.KrakowShop;
import pl.paniodprogramowania.observator.pull.observers.ObserverFloristShop;

public class Runner {

  public static void main(String[] args) {
    ObservableFloristShop warsawShop = new WarsawCentralShopObservable(new ArrayList<>());
    ObserverFloristShop krakowShop = new KrakowShop(warsawShop);
    ObserverFloristShop gdanskShop = new GdanskShop(warsawShop);

    warsawShop.setNewFlower(new Tulip());
    warsawShop.setNewFlower(new Rose());
  }
}
