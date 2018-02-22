package pl.mkowalik.minigame.box;

import pl.mkowalik.minigame.player.Player;

public class ExtraLifeBox implements Box {

    @Override
    public void awardPlayer(Player player) {
        player.addExtraLife();
    }
}
