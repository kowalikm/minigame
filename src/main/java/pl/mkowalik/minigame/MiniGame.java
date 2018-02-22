package pl.mkowalik.minigame;


import pl.mkowalik.minigame.game.Game;

public class MiniGame {

    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
        System.out.println("Rewards: " + game.getRewards());
    }
}
