package pl.paniodprogramowania.strategy.pdf.dancer;

public class Dancer {
  boolean isSkilled;

  public Dancer(boolean isSkilled) {
    this.isSkilled = isSkilled;
  }

  public int doPirouette(){
    return 1;
  }

  public int do2PirouetteIfSkilled(){
    if (isSkilled){
      return 2;
    }
    return 1;
  }

  public int failPirouettesIfUnskilled(){
    if (!isSkilled){
      return -1;
    }
    return 1;
  }
}
