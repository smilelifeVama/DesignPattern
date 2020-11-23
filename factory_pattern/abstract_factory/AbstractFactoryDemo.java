package factory_pattern.abstract_factory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory factory = new AppleFactory();
        Phone phone = factory.getPhone();
        phone.make();
    }
}
