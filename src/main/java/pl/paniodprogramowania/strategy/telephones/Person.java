package pl.paniodprogramowania.strategy.telephones;

public class Person {
 private Telephone telephone;

  public Person(Telephone telephone) {
    this.telephone = telephone;
  }

  public void callSomeone(){
    System.out.println(telephone.makePhoneCall());
  }
}
