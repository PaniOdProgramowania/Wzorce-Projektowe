package pl.paniodprogramowania.chainofresponsibilities.dumplings;

public class ShapePreparer extends DumplingsPreparer{
    public ShapePreparer(DumplingsPreparer nextStep) {
        super(nextStep);
    }

    @Override
    public void doStep() {
        System.out.println("I am making proper 'pierogi' shape");
    }
}
