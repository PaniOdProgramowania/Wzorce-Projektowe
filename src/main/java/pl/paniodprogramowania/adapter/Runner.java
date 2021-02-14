package pl.paniodprogramowania.adapter;

public class Runner {

  public static void main(String[] args) {
    Charger charger = new SocketAdapter(new Socket());
    Laptop laptop = new Laptop(charger);
    System.out.println(laptop.charge());
  }
}
