package com.developer.code;

public record ElfWeapon(WeaponType weaponType) implements Weapon {

    @Override
    public String toString() {
        return "ElfWeapon{" +
                "weaponType=" + weaponType +
                '}';
    }

}
