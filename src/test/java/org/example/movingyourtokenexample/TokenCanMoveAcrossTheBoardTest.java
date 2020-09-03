package org.example.movingyourtokenexample;

import org.junit.jupiter.api.Test;

import static org.example.movingyourtokenexample.GameService.players;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TokenCanMoveAcrossTheBoardTest {
    private static final GameService gameService = new GameService();

    @Test
    public void whenTheTokenIsPlacedOnTheBoard_ThenTheTokenIsOnSquare1() {
        gameService.startGame(1);
        assertEquals(players.get("Player1"),1);
    }

    @Test
    public void whenTheTokenIsMoved3Spaces_ThenTheTokenIsOnSquare4() {
        gameService.startGame(1);
        gameService.moveToken("Player1",3);
        assertEquals(players.get("Player1"),4);
    }

    @Test
    public void whenTheTokenIsMoved3Spaces_AndThenItIsMoved4Spaces_ThenTheTokenIsOnSquare8() {
        gameService.startGame(1);
        gameService.moveToken("Player1",3);
        gameService.moveToken("Player1",4);
        assertEquals(players.get("Player1"),8);
    }

}
