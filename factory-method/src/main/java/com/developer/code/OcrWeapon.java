package com.developer.code;

public record OcrWeapon(WeaponType weaponType) implements Weapon {


    @Override
    public String toString() {
        return "OcrWeapon{" +
                "weaponType=" + weaponType +
                '}';
    }
}
