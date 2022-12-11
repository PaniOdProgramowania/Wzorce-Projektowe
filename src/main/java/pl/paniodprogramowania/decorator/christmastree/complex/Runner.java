package pl.paniodprogramowania.decorator.christmastree.complex;

public class Runner {
    public static void main(String[] args) {
        ChristmasPlant christmasTree = new ChristmasTreeWithBalls(
                new ColouredTree("green"),
                5);

        christmasTree.look();

        ChristmasPlant artificialChristmasTree = new ChristmasTreeWithBalls(
                new ArtificialTree(),
                3);

        artificialChristmasTree.look();
    }
}
