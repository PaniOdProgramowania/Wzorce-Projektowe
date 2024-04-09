package pl.paniodprogramowania.strategy.pdf.expat.solution;

public class BikeTravel implements TravelWay{
  @Override
  public String goBackHome() {
    return "I am cycling back home for Christmas";
  }
}