package pl.paniodprogramowania.strategy.pdf.expat.solution;

public class Expat {
  private TravelWay travelWay;

  public Expat(TravelWay travelWay) {
    this.travelWay = travelWay;
  }

  public void goBackHomeForChristmas(){
    System.out.println(this.travelWay.goBackHome());
  }
}
