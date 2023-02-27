package pl.paniodprogramowania.strategy.challange.chargers;

public class BigWhiteCharger implements Charger{
  @Override
  public int charge() {
    return 10;
  }

  @Override
  public String colour() {
    return "white";
  }

  @Override
  public String shape() {
    return "big";
  }
}
