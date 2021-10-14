package pl.paniodprogramowania.decorator;

public class Runner {
  public static void main(String[] args) {

    ChristmasPlant christmasTree = new ChristmasTreeWithLights(
        new ChristmasTreeWithBalls(
            new RealTree(), 5), 2);

    christmasTree.look();
    System.out.println(christmasTree.living());
  }
}
