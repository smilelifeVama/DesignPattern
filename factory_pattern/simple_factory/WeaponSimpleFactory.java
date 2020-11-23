package factory_pattern.simple_factory;

import factory_pattern.*;

public class WeaponSimpleFactory {
    public IWeapon produceWeapon(String name) {
        if ("AK47".equals(name)) {
            return new AK47();
        } else if ("Tank".equals(name)) {
            return new Tank();
        } else if ("Missile".equals(name)) {
            return new Missile();
        } else {
            return null;
        }
    }
}
