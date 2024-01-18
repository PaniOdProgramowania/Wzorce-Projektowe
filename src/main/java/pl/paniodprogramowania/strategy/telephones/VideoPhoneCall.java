package pl.paniodprogramowania.strategy.telephones;

public class VideoPhoneCall implements Telephone {
  @Override
  public String makePhoneCall() {
    return "phoning via the Internet - we can see our faces!";
  }
}
