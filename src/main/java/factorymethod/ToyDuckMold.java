package factorymethod;

public class ToyDuckMold implements Mold{

    @Override
    public Mold inject() {
        return new ToyDuckMold();
    }
}
