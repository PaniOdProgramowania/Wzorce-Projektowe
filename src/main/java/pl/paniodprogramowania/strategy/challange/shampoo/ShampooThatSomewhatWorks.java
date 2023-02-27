package pl.paniodprogramowania.strategy.challange.shampoo;

public class ShampooThatSomewhatWorks implements Shampoo{
  @Override
  public int washHair() {
    System.out.println("This shampoo works but I need to wait longer or apply it more often for quicker results");
    return 10;
  }
}
