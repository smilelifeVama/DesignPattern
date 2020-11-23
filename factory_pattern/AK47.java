package factory_pattern;

public class AK47 implements IWeapon {
    @Override
    public void attack() {
        System.out.println("AK47 attack");
    }
}
