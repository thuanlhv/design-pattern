package factorymethod;

public class ToyCarMold implements Mold{

    @Override
    public Mold inject() {
        return new ToyCarMold();
    }
}
