package pl.paniodprogramowania.mvc.model;

import java.util.ArrayList;
import java.util.List;
import pl.paniodprogramowania.mvc.view.WeatherView;

public class WeatherModel {
  int sunPower;
  List<WeatherView> observers;

  public WeatherModel(int sunPower) {
    this.sunPower = sunPower;
    this.observers = new ArrayList<>();
  }

  public void setSunPower(int sunPower) {
    this.sunPower = sunPower;
    notifyObservers();
  }

  private void notifyObservers() {
    for (WeatherView observer : this.observers) {
      observer.showWeather();
    }
  }

  public void addObserver(WeatherView weatherView) {
    this.observers.add(weatherView);
  }

  public int getValue() {
    return sunPower;
  }
}
