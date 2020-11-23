package factory_pattern;

public class Missile implements IWeapon {
    @Override
    public void attack() {
        System.out.println("Missile attack");
    }
}
