package pl.paniodprogramowania.strategy.telephones;

public class Person {
  private boolean hasClassicPhone;
  private boolean hasVideoChatPhone;
  private boolean hasOnlinePhone;

  public boolean hasClassicPhone() {
    return hasClassicPhone;
  }

  public boolean hasVideoChatPhone() {
    return hasVideoChatPhone;
  }

  public boolean hasOnlinePhone() {
    return hasOnlinePhone;
  }

  public Person(boolean hasClassicPhone, boolean hasVideoChatPhone, boolean hasOnlinePhone) {
    this.hasClassicPhone = hasClassicPhone;
    this.hasVideoChatPhone = hasVideoChatPhone;
    this.hasOnlinePhone = hasOnlinePhone;
  }
}
