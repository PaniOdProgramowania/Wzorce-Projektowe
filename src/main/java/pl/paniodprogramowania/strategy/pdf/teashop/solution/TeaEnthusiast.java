package pl.paniodprogramowania.strategy.pdf.teashop.solution;

public class TeaEnthusiast {
  private Tea tea;

  public TeaEnthusiast(Tea tea) {
    this.tea = tea;
  }

  public void drinkTea(){
    System.out.println("I am drinking... " + tea.kindOfTea());
  }
}
