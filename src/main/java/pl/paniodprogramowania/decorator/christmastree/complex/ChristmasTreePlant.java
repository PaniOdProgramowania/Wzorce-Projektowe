package pl.paniodprogramowania.decorator.christmastree.complex;

public abstract class ChristmasTreePlant extends ChristmasPlant{
    protected ChristmasPlant christmasPlant;

    public ChristmasTreePlant(ChristmasPlant christmasPlant) {
        this.christmasPlant = christmasPlant;
    }

    public void look(){
        System.out.println("standard");
    }
}

