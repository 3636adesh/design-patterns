package com.developer.code;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum WeaponType {

    AXE("axe"),
    SWORD("sword"),
    SPEAR("spear"),
    NOT_DEFINED("not defined");

    private final String weaponType;


}
