package pl.paniodprogramowania.mvc;

import pl.paniodprogramowania.mvc.controller.WeatherController;
import pl.paniodprogramowania.mvc.model.WeatherModel;
import pl.paniodprogramowania.mvc.view.WeatherView;

public class Runner {

  public static void main(String[] args) {
    WeatherModel weatherModel = new WeatherModel(10);
    WeatherView weatherView = new WeatherView(new WeatherController(weatherModel), weatherModel);

    weatherView.showWeather();
  }
}
