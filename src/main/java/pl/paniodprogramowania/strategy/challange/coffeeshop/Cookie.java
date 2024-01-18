package pl.paniodprogramowania.strategy.challange.coffeeshop;

import java.util.Objects;

public class Cookie {
  private String colour;
  private String flavour;

  public Cookie(String colour, String flavour) {
    this.colour = colour;
    this.flavour = flavour;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Cookie cookie = (Cookie) o;

    if (!Objects.equals(colour, cookie.colour)) return false;
    return Objects.equals(flavour, cookie.flavour);
  }

  @Override
  public int hashCode() {
    int result = colour != null ? colour.hashCode() : 0;
    result = 31 * result + (flavour != null ? flavour.hashCode() : 0);
    return result;
  }
}
