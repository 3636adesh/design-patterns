package com.developer.code;

public record OrcWeapon(WeaponType weaponType) implements Weapon {


    @Override
    public String toString() {
        return "OrcWeapon{" +
                "weaponType=" + weaponType +
                '}';
    }
}
