package pl.paniodprogramowania.factory;

public class EarthenPotFactory implements PotFactory{
  @Override
  public Pot create() {
    return Pot.builder()
        .brand("Gliniane Garnkix")
        .mainIngredient("Glina")
        .maxHeat(200)
        .build();
  }
}
