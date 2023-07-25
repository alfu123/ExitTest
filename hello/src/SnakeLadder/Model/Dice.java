package SnakeLadder.Model;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public int dice;

    public Dice(int dice) {
        this.dice = dice;
        this.rolledDice();
    }

    public int rolledDice() {
        int diceNo= ThreadLocalRandom.current().nextInt(1,6);
        return diceNo;
    }
}
