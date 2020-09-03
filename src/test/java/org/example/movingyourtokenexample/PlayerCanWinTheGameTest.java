package org.example.movingyourtokenexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.movingyourtokenexample.GameService.players;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PlayerCanWinTheGameTest {
    private static final GameService gameService = new GameService();

    @BeforeEach
    void setUp() {
        gameService.startGame(1);
        gameService.moveToken("Player1", 96);
    }

    @Test
    public void givenTheTokenIsOnSquare97_whenTheTokenIsMoved3Spaces_AndThenItIsOnSquare100_ThenThePlayerHasWonTheGame() {
        assertEquals(players.get("Player1"), 97);
        gameService.moveToken("Player1", 3);
        assertEquals(players.get("Player1"), 100);
        assertTrue(gameService.checkIfPlayerWon("Player1"));

    }

    @Test
    public void givenTheTokenIsOnSquare97_whenTheTokenIsMoved4Spaces_AndThenItIsOnSquare97_ThenThePlayerHasNotWonTheGame() {
        assertEquals(players.get("Player1"), 97);
        gameService.moveToken("Player1", 4);
        assertEquals(players.get("Player1"), 101);
        assertTrue(gameService.checkIfPlayerNotWon("Player1"));
    }

}
