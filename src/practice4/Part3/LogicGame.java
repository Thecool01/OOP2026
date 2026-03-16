package practice4.Part3;

import practice4.Part3.Interfaces.Game;

public class LogicGame implements Game {
    private String player_nickname;
    public LogicGame(String player_nickname) {
        this.player_nickname = player_nickname;
    }

    @Override
    public void start() {
        System.out.println("Player: " + this.player_nickname + ". LogicGame is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Player: " + this.player_nickname + ". LogicGame is stopping...");
    }

    @Override
    public void restart() {
        System.out.println("Player: " + this.player_nickname + ". LogicGame is restart...");
    }

}
