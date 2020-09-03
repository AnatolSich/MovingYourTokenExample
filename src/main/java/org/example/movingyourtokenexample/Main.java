package org.example.movingyourtokenexample;

public class Main {
    public static void main(String[] args) {

        GameService gameService = new GameService();
        DiceService diceService = new DiceService();

        gameService.startGame(1);
        while (true) {
            gameService.moveToken("Player1", diceService.rollDice());
            if (gameService.checkIfPlayerWon("Player1") || gameService.checkIfPlayerNotWon("Player1")) {
                break;
            }
        }
        gameService.stopGame("Player1");
    }

}
