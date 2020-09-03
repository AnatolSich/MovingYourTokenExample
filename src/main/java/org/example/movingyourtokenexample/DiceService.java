package org.example.movingyourtokenexample;

import java.util.Random;

public class DiceService {
    public int rollDices() {
        Random rand = new Random();
        int i =  rand.nextInt((6 - 1) + 1) + 1;
        System.out.println(i);
        return i;
    }
}
