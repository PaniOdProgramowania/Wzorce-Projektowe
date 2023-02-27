package pl.paniodprogramowania.strategy.challange.coffeeshop;

public class Runner {
  public static void main(String[] args) {
    Coffee coffee = new DecaffeinatedCoffee();
    Human human = new Human(coffee);
    human.drinkCoffee();
  }
}
