package com.developer.code;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class ElfBlackSmith implements BlackSmith{

    private static final Map<WeaponType,ElfWeapon> ELFARSENAL;

    static {
        ELFARSENAL=new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type->ELFARSENAL.put(type,new ElfWeapon(type)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponType type) {
        return ELFARSENAL.get(type);
    }

    @Override
    public String toString() {
        return "The elf blacksmith";
    }
}
