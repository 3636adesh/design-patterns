package com.developer.code;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class OcrBlackSmith implements BlackSmith {


    private  static final Map<WeaponType,OcrWeapon> OCRARSENAL;

    static {
        OCRARSENAL   =new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> OCRARSENAL.put(type,new OcrWeapon(type)));
    }



    @Override
    public String toString() {
        return "The ocr blacksmith";
    }

    @Override
    public Weapon manufactureWeapon(WeaponType type) {
        return OCRARSENAL.get(type);
    }
}

