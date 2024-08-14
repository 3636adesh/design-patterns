package com.developer.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    public static void main(String[] args) {
        log.info("Coin tracing...");
        var copper = CoinFactory.getCoin(CoinType.COPPER);
        var gold = CoinFactory.getCoin(CoinType.GOLD);

        log.info("Copper Coin : {}", copper.getDescription());
        log.info("Gold  Coin : {}", gold.getDescription());

    }
}
