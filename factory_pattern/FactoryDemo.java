package factory_pattern;

import factory_pattern.simple_factory.WeaponSimpleFactory;

public class FactoryDemo {
    public static void main(String[] args) {
    
        WeaponSimpleFactory weaponFactory = new WeaponSimpleFactory();
        IWeapon weapon = weaponFactory.produceWeapon("AK47");
        weapon.attack();

        // IWeaponFactory tankFactory = new TankFactory();
        // IWeapon weapon = tankFactory.produceWeapon();
        // weapon.attack();

    }
}