package pl.paniodprogramowania.strategyandfactory;

import java.util.Scanner;

public class Runner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj jak nałożyć podklad: [rece, gabka, pedzel]");
    String wayOfFoundation = scanner.next();

    Face face = null;
    if ("gabka".equals(wayOfFoundation)){
      face = new Face();
      face.setFoundation(new BeautySponge());
    } else if ("rece".equals(wayOfFoundation)){
      face = new Face();
      Foundation foundation = new Hands();
      face.setFoundation(foundation);
    } else if ("pedzel".equals(wayOfFoundation)){
      face = new Face();
      face.setFoundation(new Brush());
    } else {
      System.out.println("podales cos innego, koniec");
      return;
    }

    face.putMakeUpOn();


  }
}
