package com.developer;

import com.developer.code.*;
import com.developer.code.Weapon;
import com.developer.code.WeaponType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryMethodTest {

    @Test
    void testOrcBlacksmithWithSpear() {
        BlackSmith blacksmith = new OcrBlackSmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        verifyWeapon(weapon);
    }

    private void verifyWeapon(Weapon weapon) {
        assertInstanceOf(OcrWeapon.class, weapon, "Weapon must be an object of: " + OcrWeapon.class.getName());
        assertEquals(WeaponType.SPEAR, weapon
                .weaponType(), "Weapon must be of weaponType: " + WeaponType.SPEAR);
    }
}
