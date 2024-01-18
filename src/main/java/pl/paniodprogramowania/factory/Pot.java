package pl.paniodprogramowania.factory;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
public class Pot {
  private int maxHeat;
  private String brand;
  private String mainIngredient;
}
