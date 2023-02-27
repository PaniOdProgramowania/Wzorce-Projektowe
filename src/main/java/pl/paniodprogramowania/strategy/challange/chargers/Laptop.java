package pl.paniodprogramowania.strategy.challange.chargers;

public class Laptop {
  private Charger charger;
  private int batteryLevel;

  public Laptop(Charger charger) {
    this.charger = charger;
    this.batteryLevel = 0;
  }

  public void charge(){
    while (this.batteryLevel < 90){
      this.batteryLevel += charger.charge();
      System.out.println("Charging with " + charger.colour() + " " + charger.shape()
          + " battery level is now " + this.batteryLevel);
    }
  }
}
