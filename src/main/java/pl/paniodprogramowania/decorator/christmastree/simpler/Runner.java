package pl.paniodprogramowania.decorator.christmastree.simpler;

import pl.paniodprogramowania.decorator.christmastree.complex.ChristmasPlant;
import pl.paniodprogramowania.decorator.christmastree.complex.ChristmasTreeWithBalls;
import pl.paniodprogramowania.decorator.christmastree.complex.ColouredTree;

public class Runner {
    public static void main(String[] args) {
        int numberOfXmasBalls = 5;
        int numberOfLights = 2;
        ChristmasTree christmasTree =
                new ChristmasTreeWithLights(
                        new ChristmasTree(),
                        numberOfLights
                );

        christmasTree.look();
    }
}
