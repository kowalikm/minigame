package pl.mkowalik.minigame.game;

import pl.mkowalik.minigame.player.Player;
import pl.mkowalik.minigame.pool.GameSettings;

import java.util.Arrays;

public class Game {
    private Player player = new Player();

    public void playGame() {
        GameEngine gameEngine = createGameEngine();
        gameEngine.play();
    }

    public void resetGame() {
        player = new Player();
    }

    public int getRewards() {
        return player.getReward();
    }

    private GameEngine createGameEngine() {
        GameSettings mainGameSettings =
                new GameSettings(Arrays.asList(100, 20, 20, 5, 5, 5, 5, 5),
                        1, 3, 0);
        GameSettings additionalGameSettings =
                new GameSettings(Arrays.asList(5, 10, 20),
                        0 ,0, 1);
        return new GameEngine(player, mainGameSettings, additionalGameSettings);
    }
}
