package factory_pattern.factory_method;

import factory_pattern.IWeapon;
import factory_pattern.Tank;

public class TankFactory implements IWeaponFactory {
    @Override
    public IWeapon getWeapon() {
        return new Tank();
    }
}
