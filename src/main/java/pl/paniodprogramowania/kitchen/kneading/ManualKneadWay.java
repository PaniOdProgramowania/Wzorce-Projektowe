package pl.paniodprogramowania.kitchen.kneading;

import java.util.concurrent.TimeUnit;
import pl.paniodprogramowania.kitchen.Dough;
import pl.paniodprogramowania.kitchen.NoDoughException;

public class ManualKneadWay implements DoughKneadWay {

  @Override
  public Dough knead(Dough dough) {
    checkDough(dough);
    System.out.println("Manual work is taking a bit of a time...");
    slowKneading(dough);
    System.out.println("Manual kneading finally kneaded the dough! :)");
    return dough;
  }

  private void checkDough(Dough dough) {
    if (dough == null){
      throw new NoDoughException("No dough to knead!");
    }
  }

  private void slowKneading(Dough dough) {
    try {
      TimeUnit.SECONDS.sleep(30);
    } catch (InterruptedException e) {
      System.out.println("uups! manual kneading was interrupted by other person :(");
    }
    dough.setKneaded(true);
  }
}
