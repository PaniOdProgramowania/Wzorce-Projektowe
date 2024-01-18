package pl.paniodprogramowania.factory;

public class MetalPotFactory implements PotFactory{
  @Override
  public Pot create() {
    return Pot.builder()
        .maxHeat(250)
        .brand("Garnkis")
        .mainIngredient("Metal")
        .build();
  }
}
