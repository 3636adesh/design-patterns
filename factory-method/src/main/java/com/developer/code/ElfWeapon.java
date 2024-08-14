package com.developer.code;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

public record ElfWeapon(WeaponType weaponType) implements Weapon {

    @Override
    public String toString() {
        return "ElfWeapon{" +
                "weaponType=" + weaponType +
                '}';
    }
}
