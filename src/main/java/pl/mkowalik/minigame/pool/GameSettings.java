package pl.mkowalik.minigame.pool;

import java.util.List;

public class GameSettings {
    private List<Integer> prizeScheme;

    private int extraLifeCount;

    private int gameOverCount;

    private int secondChanceCount;

    public GameSettings(List<Integer> prizeScheme, int extraLifeCount, int gameOverCount, int secondChanceCount) {
        this.prizeScheme = prizeScheme;
        this.extraLifeCount = extraLifeCount;
        this.gameOverCount = gameOverCount;
        this.secondChanceCount = secondChanceCount;
    }

    public List<Integer> getPrizeScheme() {
        return prizeScheme;
    }

    public int getExtraLifeCount() {
        return extraLifeCount;
    }

    public int getGameOverCount() {
        return gameOverCount;
    }

    public int getSecondChanceCount() {
        return secondChanceCount;
    }
}
