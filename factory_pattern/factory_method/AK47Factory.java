package factory_pattern.factory_method;

import factory_pattern.AK47;
import factory_pattern.IWeapon;

public class AK47Factory implements IWeaponFactory{
    @Override
    public IWeapon getWeapon() {
        return new AK47();
    }
}
