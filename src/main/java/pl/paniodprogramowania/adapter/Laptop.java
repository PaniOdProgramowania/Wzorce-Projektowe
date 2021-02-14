package pl.paniodprogramowania.adapter;

public class Laptop {
  private Charger charger;

  public Laptop(Charger charger) {
    this.charger = charger;
  }

  public double charge() {
    return charger.give19V();
  }
}
