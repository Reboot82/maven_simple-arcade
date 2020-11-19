package com.github.curriculeon.arcade.numberguess;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessPlayer implements PlayerInterface {
    private ArcadeAccount arcadeAccount;

    @Override
    public ArcadeAccount getArcadeAccount() {
        return this.arcadeAccount;
    }

    @Override
    public NumberGuessGame play() {
        NumberGuessGame numberGuessGame = new NumberGuessGame();
        return numberGuessGame;
    }
}