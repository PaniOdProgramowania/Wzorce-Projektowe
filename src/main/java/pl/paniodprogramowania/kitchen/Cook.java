package pl.paniodprogramowania.kitchen;

import pl.paniodprogramowania.kitchen.kneading.DoughKneadWay;

public class Cook {
  private final DoughKneadWay doughKneadWay;

  public Cook(DoughKneadWay doughKneadWay) {
    this.doughKneadWay = doughKneadWay;
  }

  public boolean prepareDough(){
    System.out.println("Cook will now start preparing the dough...");
    boolean kneaded = this.doughKneadWay.knead(new Dough()).isKneaded();
    System.out.println("Cook finished!");
    return kneaded;
  }
}
