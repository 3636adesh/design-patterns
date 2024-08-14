package com.developer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppTest {

    @Test
    void shouldExecuteWithoutExceptions(){
        assertDoesNotThrow(() -> CodeApplication.main(new String[]{}));
    }
}
