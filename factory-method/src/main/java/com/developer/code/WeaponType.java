package com.developer.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum WeaponType {

    SPEAR("spear"),
    NOT_DEFINED("not_defined"),
    AXE("axe");

    private final String type;
}
