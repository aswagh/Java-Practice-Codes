package com.springcore.GamingConsole;

import com.springcore.GamingConsole.games.GameRunner;
import com.springcore.GamingConsole.games.MarioGame;

public class GammingApp {

    public static void main(String[] args) {
        // Tight Coupling
        MarioGame marioGame = new MarioGame();
        GameRunner gamerRunner = new GameRunner(marioGame);
        gamerRunner.run();

    }
}

