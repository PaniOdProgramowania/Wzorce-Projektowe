package pl.paniodprogramowania.strategy.telephones;

public class ClassicTelephone implements Telephone{
  @Override
  public String makePhoneCall() {
    return "calling from a classic telephone";
  }
}
