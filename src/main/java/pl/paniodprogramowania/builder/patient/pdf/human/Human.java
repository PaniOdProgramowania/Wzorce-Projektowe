package pl.paniodprogramowania.builder.patient.pdf.human;

import java.time.Instant;

public class Human {
  private Coffee coffee;
  private int energyLevel;
  private Instant lastTimeHadCoffee;

  private Human(HeadBuilder headBuilder) {
    this.coffee = headBuilder.coffee;
    this.energyLevel = headBuilder.energyLevel;
    this.lastTimeHadCoffee = headBuilder.lastTimeHadCoffee;
  }

  public static class HeadBuilder {
    private Coffee coffee;
    private int energyLevel;
    private Instant lastTimeHadCoffee;

    public HeadBuilder withCoffee(Coffee coffee) {
      this.coffee = coffee;
      return this;
    }

    public HeadBuilder withEnergyLevel(int energyLevel) {
      this.energyLevel = energyLevel;
      return this;
    }

    public HeadBuilder withLastTimeHadCoffee(Instant lastTimeHadCoffee) {
      this.lastTimeHadCoffee = lastTimeHadCoffee;
      return this;
    }

    public Human build(){
      return new Human(this);
    }
  }
}
