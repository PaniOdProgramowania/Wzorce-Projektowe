package pl.paniodprogramowania.strategy.telephones;

public class ClassicTelephone implements Telephone{
  @Override
  public String makePhoneCall() {
    return "phoning from a classic telephone";
  }
}
