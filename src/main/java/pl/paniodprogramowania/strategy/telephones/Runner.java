package pl.paniodprogramowania.strategy.telephones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner {
  public static void main(String[] args) {
    Person me = new Person(new VideoPhoneCall());
    me.callSomeone();
  }
}
