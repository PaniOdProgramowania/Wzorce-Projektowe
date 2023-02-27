package pl.paniodprogramowania.strategy.challange.shampoo;

public class Runner {
  public static void main(String[] args) {
    Shampoo shampoo = new ShampooThatDoesntWork();
    Head head = new Head(shampoo);
    head.washHair();
  }
}
