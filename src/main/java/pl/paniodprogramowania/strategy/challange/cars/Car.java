package pl.paniodprogramowania.strategy.challange.cars;

public class Car {
  private Gearbox gearbox;

  public Car(Gearbox gearbox) {
    this.gearbox = gearbox;
  }

  public void runTheCar(){
    System.out.println("I am a car and my gear is...");
    gearbox.run();
  }
}
