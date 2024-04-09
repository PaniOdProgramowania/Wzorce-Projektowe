package pl.paniodprogramowania.strategy.pdf.expat.solution;

public class PlaneTravel implements TravelWay{
  @Override
  public String goBackHome() {
    return "I am flying home for Christmas";
  }
}
