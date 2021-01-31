package pl.paniodprogramowania;

import pl.paniodprogramowania.kitchen.Cook;
import pl.paniodprogramowania.kitchen.kneading.AutomatedKneadWay;
import pl.paniodprogramowania.kitchen.kneading.ManualKneadWay;

public class Runner {
  public static void main(String[] args) {
    Cook manualCook = new Cook(new ManualKneadWay());
    manualCook.prepareDough();

    Cook automatedCook = new Cook(new AutomatedKneadWay());
    automatedCook.prepareDough();
  }
}
