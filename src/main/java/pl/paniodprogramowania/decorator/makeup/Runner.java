package pl.paniodprogramowania.decorator.makeup;

public class Runner {
  public static void main(String[] args) {
    var face = new Fluid("Loreal",
        new Powder("beżowy",
            new Primer(20,
                new Face()
            )
        )
    );
    System.out.println(face.printFace());
  }
}
