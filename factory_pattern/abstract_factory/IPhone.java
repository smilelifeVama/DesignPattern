package factory_pattern.abstract_factory;

public class IPhone implements Phone{
    @Override
    public void make() {
        System.out.println("IPhone make");
    }
}