package pl.paniodprogramowania.strategy.telephones;

public class Runner {
  public static void main(String[] args) {
    Person me = new Person(true, false, false);
    if (me.hasClassicPhone()) {
      System.out.println("calling my friend from a classic phone!");
    } else if (me.hasVideoChatPhone()){
      System.out.println("calling my friend from a video phone!");
    } else if (me.hasOnlinePhone()) {
      System.out.println("calling my friend from a video phone!");
    }
  }
}
