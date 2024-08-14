package com.developer.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    public static void main(String[] args) {
        log.info("Coin tracing...");
        log.info("Copper coin: {}", CoinFactory.getCoin(CoinType.COPPER).getDescription());
        log.info("Copper coin: {}", CoinFactory.getCoin(CoinType.GOLD).getDescription());
    }
}
