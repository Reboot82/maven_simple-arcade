package com.github.curriculeon.arcade.numberguess;

import com.github.curriculeon.arcade.GameInterface;
import com.github.curriculeon.arcade.PlayerInterface;
import com.github.curriculeon.utils.AnsiColor;
import com.github.curriculeon.utils.IOConsole;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessGame implements GameInterface {
    private final IOConsole console = new IOConsole(AnsiColor.BLUE);
    private NumberGuessPlayer activePlayer;

    @Override
    public void add(PlayerInterface player) {
        this.activePlayer = (NumberGuessPlayer) player;
    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {
        int rng = (int) Math.ceil(Math.random()*10);
        System.out.println("I'm thinking of a number 1-10. Can you guess it in one try?");
        int guess = console.getIntegerInput("Enter your guess: ");
        if(guess == rng) {
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, you lose. The number was " + rng);
        }
        String input = console.getStringInput("Play again? ");
        if(input.equals("yes")){
            run();
        }
    }
}