package com.developer;

import com.developer.code.CoinFactory;
import com.developer.code.CoinType;
import com.developer.code.GoldCoin;
import org.junit.jupiter.api.Test;

public class CoinFactoryTest {

    @Test
    void shouldReturnGoldCoinInstance() {
       final var goldCoin = CoinFactory.getCoin(CoinType.GOLD);
       assert goldCoin instanceof GoldCoin;
    }
}
