package pl.paniodprogramowania.mvc.controller;

import java.util.Scanner;
import pl.paniodprogramowania.mvc.model.WeatherModel;

public class WeatherController {

  private WeatherModel weatherModel;

  public WeatherController(WeatherModel weatherModel) {
    this.weatherModel = weatherModel;
  }

  public void awaitUserAction() {
    int rainLevel = getSunsStrength();
    weatherModel.setSunPower(rainLevel);
  }

  private int getSunsStrength() {
    Scanner scanner = new Scanner(System.in);
    int sunLevel = scanner.nextInt();
    checkSunsStrength(sunLevel);
    return sunLevel;
  }

  private void checkSunsStrength(int sunLevel) {
    if (sunLevel < 0) {
      System.out.println("End of world!");
      System.exit(0);
    }
  }
}
