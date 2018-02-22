package pl.mkowalik.minigame.box;

import pl.mkowalik.minigame.player.Player;

public class SecondChanceBox implements Box {

    @Override
    public void awardPlayer(Player player) {
        player.giveSecondChance();
    }
}
