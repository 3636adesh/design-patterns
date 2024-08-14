package com.developer.code;

public class OcrBlackSmith implements Blacksmith{

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return switch (weaponType) {
            case SWORD, NOT_DEFINED -> null;
            case SPEAR -> new ElfWeapon(weaponType);
            case AXE -> new OrcWeapon(weaponType);
        };
    }
}
