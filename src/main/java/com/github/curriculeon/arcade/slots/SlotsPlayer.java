package com.github.curriculeon.arcade.slots;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer implements PlayerInterface {
    private ArcadeAccount arcadeAccount;

    @Override
    public ArcadeAccount getArcadeAccount() {
        return this.arcadeAccount;
    }

    @Override
    public SlotsGame play() {
        SlotsGame slotsGame = new SlotsGame();
        return slotsGame;
    }
}