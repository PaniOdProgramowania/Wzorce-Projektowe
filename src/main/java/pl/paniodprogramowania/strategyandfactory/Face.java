package pl.paniodprogramowania.strategyandfactory;

public class Face {
  private Foundation foundation;

  public void setFoundation(Foundation foundation) {
    this.foundation = foundation;
  }

  public void putMakeUpOn(){
    System.out.println("putting makeup on");
    foundation.putFoundationOn();
  }
}
