package factory_pattern.abstract_factory;

public class AppleFactory extends AbstractFactory {

    @Override
    public PC getPC() {
        return new Mac();
    }

    @Override
    public Phone getPhone() {
        return new IPhone();
    }    
}
