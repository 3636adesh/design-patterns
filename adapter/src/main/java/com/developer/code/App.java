package com.developer.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    public static void main(String[] args) {
        // The captain can only operate rowing boats but with adapter he is able to
        // use fishing boats as well
        Captain captain = new Captain(new FishingBotAdapter());
        captain.row();

    }
}
