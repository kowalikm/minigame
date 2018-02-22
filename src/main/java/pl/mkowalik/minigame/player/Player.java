package pl.mkowalik.minigame.player;

public class Player {
    private int reward = 0;
    private int lifeCount = 1;
    private boolean hasSecondChance = false;

    public int getReward() {
        return reward;
    }

    public boolean hasLife() {
        return lifeCount > 0;
    }

    public  void addReward(int rewardValue) {
        reward += rewardValue;
    }

    public void addExtraLife() {
        lifeCount++;
    }

    public void takeLife() {
        lifeCount--;
    }

    public boolean hasSecondChance() {
        return hasSecondChance;
    }

    public void giveSecondChance() {
        hasSecondChance = true;
    }

    public void useSecondChance() {
        lifeCount++;
        hasSecondChance = false;
    }
}
