package factory_pattern.abstract_factory;

public class MiPhone implements Phone {
    @Override
    public void make() {
        System.out.println("MiPhone make");
    }
}
