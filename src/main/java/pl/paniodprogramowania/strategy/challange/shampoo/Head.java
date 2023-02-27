package pl.paniodprogramowania.strategy.challange.shampoo;

public class Head {
  private int hairLength;
  private Shampoo shampoo;

  public Head(Shampoo shampoo) {
    this.shampoo = shampoo;
    this.hairLength = 20;
  }

  public void washHair(){
    System.out.println("My hair before washing it with shampoo were " + hairLength + " mm long");
    int resultOfTheShampoo = shampoo.washHair();
    hairLength += resultOfTheShampoo;
    System.out.println("My hair after washing it with shampoo were " + hairLength + " mm long");
  }
}
