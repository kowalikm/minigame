package pl.mkowalik.minigame.box;

import pl.mkowalik.minigame.player.Player;

public class GameOverBox implements Box {

    @Override
    public void awardPlayer(Player player) {
        player.takeLife();
    }
}
