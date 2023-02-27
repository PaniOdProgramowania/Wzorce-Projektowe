package pl.paniodprogramowania.strategy.challange.coffeeshop;

public class Human {
  private Coffee coffee;
  private int energyLevel;

  public Human(Coffee coffee) {
    this.coffee = coffee;
    this.energyLevel = 0;
  }

  public void drinkCoffee(){
    System.out.println("I am now tasting coffee... with current energy level " + this.energyLevel);
    this.energyLevel += coffee.giveEnergy();
    System.out.println("After coffee my energy level is " + this.energyLevel);
  }
}
