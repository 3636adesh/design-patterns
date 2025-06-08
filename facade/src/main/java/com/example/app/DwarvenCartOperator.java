package com.example.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DwarvenCartOperator extends DwarvenMineWorker {
    @Override
    public String name() {
        return "Dwarf cart operator";
    }

    @Override
    public void work() {
        log.info("{} moves gold chunks out of the mine.", name());
    }
}
