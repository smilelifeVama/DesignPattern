package factory_pattern.factory_method;

import factory_pattern.IWeapon;
import factory_pattern.Missile;

public class MissileFactory implements IWeaponFactory {
    @Override
    public IWeapon getWeapon() {
        return new Missile();
    }
}
