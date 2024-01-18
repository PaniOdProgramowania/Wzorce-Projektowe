package pl.paniodprogramowania.strategy.kitchen;

import pl.paniodprogramowania.strategy.kitchen.Cook;
import pl.paniodprogramowania.strategy.kitchen.kneading.AutomatedKneadWay;
import pl.paniodprogramowania.strategy.kitchen.kneading.ManualKneadWay;

public class Runner {
  public static void main(String[] args) {
    Cook manualCook = new Cook(new ManualKneadWay());
    manualCook.prepareDough();

    Cook automatedCook = new Cook(new AutomatedKneadWay());
    automatedCook.prepareDough();
  }
}
