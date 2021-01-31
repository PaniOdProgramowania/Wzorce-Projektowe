package pl.paniodprogramowania.kitchen.kneading;

import java.util.concurrent.TimeUnit;
import pl.paniodprogramowania.kitchen.Dough;
import pl.paniodprogramowania.kitchen.NoDoughException;

public class AutomatedKneadWay implements DoughKneadWay {

  @Override
  public Dough knead(Dough dough) {
    checkDough(dough);
    System.out.println("Automated work will be fast");
    fastKneading(dough);
    System.out.println("Automated kneading finally kneaded the dough! :)");
    return dough;
  }

  private void checkDough(Dough dough) {
    if (dough == null){
      throw new NoDoughException("No dough to knead!");
    }
  }

  private void fastKneading(Dough dough) {
    try {
      TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) {
      System.out.println("uups! equipment failed $%^&*(");
    }
    dough.setKneaded(true);
  }
}
