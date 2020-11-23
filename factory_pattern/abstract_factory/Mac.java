package factory_pattern.abstract_factory;

public class Mac implements PC {
    @Override
    public void make() {
        System.out.println("Mac make");
    }
}
