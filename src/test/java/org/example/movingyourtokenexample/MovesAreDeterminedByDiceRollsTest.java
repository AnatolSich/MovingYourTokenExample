package org.example.movingyourtokenexample;

import org.junit.jupiter.api.Test;

import static org.example.movingyourtokenexample.GameService.players;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovesAreDeterminedByDiceRollsTest {
    private static final DiceService diceService = new DiceService();
    private static final GameService gameService = new GameService();
    @Test
    public void whenThePlayerRollsADice_ThenTheResultShouldBe1to6Inclusive() {
        int result = diceService.rollDices();
        assertTrue(1 <= result && result <= 6);
    }

    @Test
    public void whenThePlayerRollsA4_ThenTokenShouldMove4Spaces() {
        gameService.startGame(1);
        gameService.moveToken("Player1", 4);
        assertEquals(players.get("Player1"), 5);
    }


}
