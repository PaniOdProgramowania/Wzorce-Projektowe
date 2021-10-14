package pl.paniodprogramowania.observator.push;

import java.util.ArrayList;
import pl.paniodprogramowania.observator.push.flowers.Rose;
import pl.paniodprogramowania.observator.push.flowers.Tulip;
import pl.paniodprogramowania.observator.push.observable.ObservableFloristShop;
import pl.paniodprogramowania.observator.push.observable.WarsawCentralShopObservable;
import pl.paniodprogramowania.observator.push.observers.GdanskShop;
import pl.paniodprogramowania.observator.push.observers.KrakowShop;

public class Runner {

  public static void main(String[] args) {
    ObservableFloristShop warsawShop = new WarsawCentralShopObservable(new ArrayList<>());
    warsawShop.addShop(new KrakowShop());
    warsawShop.addShop(new GdanskShop());

    warsawShop.setNewFlower(new Tulip());
    warsawShop.setNewFlower(new Rose());
  }
}
