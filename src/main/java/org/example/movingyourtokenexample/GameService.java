package org.example.movingyourtokenexample;

import java.util.HashMap;
import java.util.Map;

public class GameService {
    public static Map<String, Integer> players = new HashMap<>();

    public void startGame(int playersnumber) {
        for (int i = 1; i <= playersnumber; i++) {
            players.put("Player" + i, 1);
        }
    }

    public void moveToken(String player, Integer spaceNumber) {
        players.replace(player, players.get(player) + spaceNumber);
    }

    public boolean checkIfPlayerWon(String player) {
        return players.get(player) == 100;
    }


    public boolean checkIfPlayerNotWon(String player) {
        return players.get(player) > 100;
    }

    public void stopGame(String player) {
        String finish = player;
        if (checkIfPlayerWon(player)) {
            finish = player + " won the game.";
        } else if (checkIfPlayerNotWon(player)) {
            finish = player + " lost the game with " + players.get(player) + " points.";
        }
        System.out.println(finish);
        System.exit(0);
    }

}
