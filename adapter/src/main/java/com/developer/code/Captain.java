package com.developer.code;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public final class Captain {

    private final RowingBoat rowingBoat;

    void row() {
        rowingBoat.row();
    }
}
