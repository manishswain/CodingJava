package OOPS.Interfaces;

public class SmartPhone implements Phone, Camera {

    @Override
    public void record() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void click() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void call() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void hangUp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
