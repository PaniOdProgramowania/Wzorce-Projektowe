package pl.paniodprogramowania.strategy.kitchen;

public class Dough {
  private boolean isKneaded = false;

  public void setKneaded(boolean kneadled) {
    isKneaded = kneadled;
  }

  public boolean isKneaded() {
    return isKneaded;
  }
}
