package pl.paniodprogramowania.strategy.pdf.expat.solution;

public class CarTravel implements TravelWay{
  @Override
  public String goBackHome() {
    return "I am driving home for Christmas";
  }
}
