package factory_pattern.abstract_factory;

public class MiFactory extends AbstractFactory {

    @Override
    public PC getPC() {
        return new MiBook();
    }

    @Override
    public Phone getPhone() {
        return new MiPhone();
    }
    
}
