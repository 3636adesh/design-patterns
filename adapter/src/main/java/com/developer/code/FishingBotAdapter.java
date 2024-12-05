package com.developer.code;

public class FishingBotAdapter implements RowingBoat {

    private final FishingBot fishingBot=new FishingBot();

    @Override
    public void row() {
        fishingBot.sail();
    }
}
