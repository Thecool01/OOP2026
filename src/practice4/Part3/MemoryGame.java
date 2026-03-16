package practice4.Part3;

import practice4.Part3.Interfaces.IGame;

public class MemoryGame implements IGame {
    private String player_nickname;
    public MemoryGame(String player_nickname) {
        this.player_nickname = player_nickname;
    }


    @Override
    public void start() {
        System.out.println("Player: " + this.player_nickname + ". Memory Game is starting...");
    }

    @Override
    public void restart() {
        System.out.println("Player: " + this.player_nickname + ". Memory Game is restarting...");
    }

    @Override
    public void stop() {
        System.out.println("Player: " + this.player_nickname + ". Memory Game is stopping...");
    }

    @Override
    public void save() {
        System.out.println("Player: " + this.player_nickname + ". Memory Game is saving...");
    }



}
