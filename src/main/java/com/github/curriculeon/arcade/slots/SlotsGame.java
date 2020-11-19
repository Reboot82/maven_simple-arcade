package com.github.curriculeon.arcade.slots;

import com.github.curriculeon.arcade.GameInterface;
import com.github.curriculeon.arcade.PlayerInterface;
import com.github.curriculeon.utils.AnsiColor;
import com.github.curriculeon.utils.IOConsole;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame implements GameInterface {
    private final IOConsole console = new IOConsole(AnsiColor.BLUE);
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
        String bar = " BAR ";
        String seven = "  7  ";
        String cherry = "  0  ";
        String[] outcomes = {bar, seven, cherry};
        String wait = console.getStringInput("Press Enter to Pull Lever");
        int column1 = randomNumber(0,3);
        int column2 = randomNumber(0,3);
        int column3 = randomNumber(0,3);
        System.out.print(outcomes[column1]);
        System.out.print(outcomes[column2]);
        System.out.println(outcomes[column3]);
        if(column1 == column2 && column2 == column3){
            System.out.println("You Win!");
        } else {
            System.out.println("Better luck next time.");
        }
        String input = console.getStringInput("Play again, " + this.activePlayer.getArcadeAccount().getAccountName() + "? ");
        if(input.equals("yes")){
            run();
        }
    }

    public int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
