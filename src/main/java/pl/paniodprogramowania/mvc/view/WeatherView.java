package pl.paniodprogramowania.mvc.view;

import pl.paniodprogramowania.mvc.controller.WeatherController;
import pl.paniodprogramowania.mvc.model.WeatherModel;

public class WeatherView {

  private WeatherController weatherController;
  private WeatherModel weatherModel;

  public WeatherView(WeatherController weatherController, WeatherModel weatherModel) {
    this.weatherController = weatherController;
    this.weatherModel = weatherModel;
    weatherModel.addObserver(this);
  }

  public void showWeather() {
    clearScreen();
    printWeather(weatherModel.getValue());
    System.out.println("Dear user! Please provide sun's next shining level or -1 for exit: ");
    weatherController.awaitUserAction();
  }

  private void clearScreen() {
    for (int i = 0; i < 10; i++) {
      System.out.println();
    }
  }

  private void printWeather(int strength) {
    System.out.println("" +
        "     |\n" +
        "  \\ | /\n" +
        "   \\*/\n" +
        "--**" + strength + "**-- \n" +
        "   /*\\\n" +
        "  / | \\\n" +
        "    |");
  }
}
