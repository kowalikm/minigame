package pl.mkowalik.minigame.box;

import pl.mkowalik.minigame.player.Player;

public class PrizeBox implements Box {
    private int prize;

    public PrizeBox(int prize) {
        this.prize = prize;
    }

    @Override
    public void awardPlayer(Player player) {
        player.addReward(prize);
    }
}
