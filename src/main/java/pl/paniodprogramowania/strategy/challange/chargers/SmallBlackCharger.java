package pl.paniodprogramowania.strategy.challange.chargers;

public class SmallBlackCharger implements Charger{
  @Override
  public int charge() {
    return 15;
  }

  @Override
  public String colour() {
    return "Black";
  }

  @Override
  public String shape() {
    return "Small";
  }
}
