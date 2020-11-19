package com.github.curriculeon.arcade.slots;

import com.github.curriculeon.arcade.GameInterface;
import com.github.curriculeon.arcade.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame implements GameInterface {
    private SlotsPlayer activePlayer;

    @Override
    public void add(PlayerInterface player) {
        this.activePlayer = (SlotsPlayer) player;
    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {
        System.out.println("You just played Slots!");
    }
}
