package com.springcore.GamingConsole.games;

public class GameRunner {
    MarioGame marioGame;
    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }
    public void run(){
        System.out.println("running");
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();
    }
}
