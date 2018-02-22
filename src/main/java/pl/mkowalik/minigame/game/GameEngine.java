package pl.mkowalik.minigame.game;

import pl.mkowalik.minigame.box.Box;
import pl.mkowalik.minigame.player.Player;
import pl.mkowalik.minigame.pool.GamePool;
import pl.mkowalik.minigame.pool.GameSettings;

class GameEngine {
    private final Player player;
    private final GameSettings mainPoolSettings;
    private final GameSettings additionalPoolSettings;
    private boolean secondChanceAwarded = false;

    public GameEngine(Player player, GameSettings mainPoolSettings, GameSettings additionalPoolSettings) {
        this.player = player;
        this.mainPoolSettings = mainPoolSettings;
        this.additionalPoolSettings = additionalPoolSettings;
    }


    public void play() {
        GamePool gamePool = new GamePool(mainPoolSettings);

        while(player.hasLife()) {
            playOnce(gamePool);
        }

        gamePool = new GamePool(additionalPoolSettings);

        if(secondChanceAwarded) {
            gamePool.disableSecondChances();
        }

        playOnce(gamePool);

        if(player.hasSecondChance()) {
            player.useSecondChance();
            secondChanceAwarded = true;
            play();
        }
    }

    private void playOnce(GamePool gamePool) {
        Box box = gamePool.takeBox();
        box.awardPlayer(player);
    }
}
