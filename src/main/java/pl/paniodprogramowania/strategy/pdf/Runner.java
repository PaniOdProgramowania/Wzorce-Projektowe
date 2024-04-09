package pl.paniodprogramowania.strategy.pdf;

import pl.paniodprogramowania.strategy.challange.cars.AutomaticGear;
import pl.paniodprogramowania.strategy.challange.cars.Gearbox;
import pl.paniodprogramowania.strategy.challange.cars.ManualGear;

import java.util.Map;
import java.util.function.Function;

public class Runner {
  public static void main(String[] args) {
    strategyAsFunction();
  }

  private static void strategyAsFunction() {
    var squareArea = calculateArea(4, a -> (a * a));

    var triangleAre = calculateArea(4, a ->
        calculateArea(5, h -> 0.5 * a * h));

    var trapezeArea = calculateArea(4, a ->
        calculateArea(7, b ->
            calculateArea(2, h -> 0.5 * (a + b) * h)));

    System.out.println("pole kwadratu o boku a = 4 wynosi: " + squareArea);
    System.out.println("pole trójkąta o podstawie a = 4 i wysokości h = 5 wynosi: " + triangleAre);
    System.out.println("pole trapezu o jednej podstawe a = 4, "
        + "drugiej podstawie b = 7 i wysokości h = 2 wynosi: " + trapezeArea);
  }

  private static void strategyAsMap() {
    Gearbox manualGearbox = new ManualGear();
    Gearbox automaticGearbox = new AutomaticGear();

    Map<String, Gearbox> gearboxes = Map.of(
        "manual", manualGearbox,
        "automatic", automaticGearbox
    );
    gearboxes.get("manual").changeGear();
  }

  private static double calculateArea(double a, Function<Double, Double> mathematicalFormula) {
    return mathematicalFormula.apply(a);
  }

  private String travelWithCar() {
    return "I am driving home for Christmas";
  }

  private String travelWithPlane() {
    return "I am flying home for Christmas";
  }

  private String travelOnFoot() {
    return "I am walking back home for Christmas";
  }

  private String travelOnBike() {
    return "I am cycling back home for Christmas";
  }
}
