package pl.paniodprogramowania.strategy.challange.shampoo;

public class ShampooThatDoesntWork implements Shampoo{
  @Override
  public int washHair() {
    System.out.println("This shampoo is a scam. It makes the hair shorter instead of longer!");
    return -10;
  }
}
