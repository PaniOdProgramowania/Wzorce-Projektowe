package pl.paniodprogramowania.strategy.challange.cars;

public class Runner {
  public static void main(String[] args) {
    Gearbox gearbox = new ManualGear();
    Car car = new Car(gearbox);
    car.runTheCar();
  }
}
