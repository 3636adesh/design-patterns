package com.developer.code;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Slf4j
public class App {

    private static final String MANUFACTURED = "{} manufactured {}";


    public static void main(String[] args) {

        BlackSmith blackSmith = new ElfBlackSmith();
        var weapon = blackSmith.manufactureWeapon(WeaponType.SPEAR);
        log.info(MANUFACTURED, blackSmith, weapon);
        weapon = blackSmith.manufactureWeapon(WeaponType.AXE);
        log.info(MANUFACTURED, blackSmith, weapon);

        log.info("-------------");
        blackSmith = new OcrBlackSmith();
        weapon = blackSmith.manufactureWeapon(WeaponType.SPEAR);
        log.info(MANUFACTURED, blackSmith, weapon);
        weapon = blackSmith.manufactureWeapon(WeaponType.AXE);
        log.info(MANUFACTURED, blackSmith, weapon);


    }
}
