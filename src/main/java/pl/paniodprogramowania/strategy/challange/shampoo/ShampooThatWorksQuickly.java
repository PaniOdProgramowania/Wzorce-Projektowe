package pl.paniodprogramowania.strategy.challange.shampoo;

public class ShampooThatWorksQuickly implements Shampoo{
  @Override
  public int washHair() {
    System.out.println("This shampoo works very well!");
    return 5;
  }
}
