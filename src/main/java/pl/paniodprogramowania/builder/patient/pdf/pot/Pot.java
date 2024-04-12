package pl.paniodprogramowania.builder.patient.pdf.pot;

public class Pot {
  private Flower flower;
  private String typeOfGround;
  private double lightLevel;
  private double hydrationLevel;

  private Pot(PotBuilder potBuilder) {
    this.flower = potBuilder.flower;
    this.typeOfGround = potBuilder.typeOfGround;
    this.lightLevel = potBuilder.lightLevel;
    this.hydrationLevel = potBuilder.hydrationLevel;
  }

  public static class PotBuilder {
    private Flower flower;
    private String typeOfGround;
    private double lightLevel;
    private double hydrationLevel;

    public PotBuilder withFlower(Flower flower) {
      this.flower = flower;
      return this;
    }

    public PotBuilder withTypeOfGround(String typeOfGround) {
      this.typeOfGround = typeOfGround;
      return this;
    }

    public PotBuilder withLightLevel(double lightLevel) {
      this.lightLevel = lightLevel;
      return this;
    }

    public PotBuilder withHydrationLevel(double hydrationLevel) {
      this.hydrationLevel = hydrationLevel;
      return this;
    }

    public Pot build(){
      return new Pot(this);
    }
  }
}
