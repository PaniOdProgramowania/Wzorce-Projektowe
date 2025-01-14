package pl.paniodprogramowania.chainofresponsibilities.universitelearning;

public class Runner {
  public static void main(String[] args) {
    var technologyClass = new Intership(
        new Workshop(
            new Laboratory(
                new TheoryClass(null)
            )
        )
    );
    technologyClass.performSemester();
  }
}
