package pl.paniodprogramowania.builder.patient.pdf;

import pl.paniodprogramowania.builder.patient.pdf.head.Head;
import pl.paniodprogramowania.builder.patient.pdf.head.Shampoo;
import pl.paniodprogramowania.builder.patient.pdf.human.Coffee;
import pl.paniodprogramowania.builder.patient.pdf.human.Human;
import pl.paniodprogramowania.builder.patient.pdf.pot.Flower;
import pl.paniodprogramowania.builder.patient.pdf.pot.Pot;

import java.time.Instant;

public class Runner {
  public static void main(String[] args) {
    Head head = new Head.HeadBuilder()
        .withColour("blonde")
        .withLength(50)
        .withThickness(2)
        .withShampoo(new Shampoo(15.99))
        .build();

    Human human = new Human.HeadBuilder()
        .withCoffee(new Coffee("Portugal coffee beans"))
        .withEnergyLevel(-10)
        .withLastTimeHadCoffee(Instant.now())
        .build();

    Pot pot = new Pot.PotBuilder()
        .withFlower(new Flower("Rose"))
        .withHydrationLevel(20.)
        .withTypeOfGround("nitrogen substrate")
        .withLightLevel(14.)
        .build();
  }
}
