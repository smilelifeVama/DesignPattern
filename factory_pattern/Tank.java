package factory_pattern;

public class Tank implements IWeapon{
    @Override
    public void attack() {
        System.out.println("Tank attack");
    }
}
