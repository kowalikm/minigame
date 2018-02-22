package pl.mkowalik.minigame.pool;

import pl.mkowalik.minigame.box.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GamePool {
    private List<Box> gamePool;

    public GamePool(GameSettings gameSettings) {
        gamePool = new ArrayList<>();

        gamePool.addAll(gameSettings.getPrizeScheme().stream()
                .map(p -> new PrizeBox(p))
                .collect(Collectors.toList()));

        gamePool.addAll(Collections.nCopies(gameSettings.getExtraLifeCount(), new ExtraLifeBox()));
        gamePool.addAll(Collections.nCopies(gameSettings.getGameOverCount(), new GameOverBox()));
        gamePool.addAll(Collections.nCopies(gameSettings.getSecondChanceCount(), new SecondChanceBox()));

        Collections.shuffle(gamePool);
    }

    public Box takeBox() {
        Box box = gamePool.stream().findFirst().get();
        gamePool.remove(box);
        return box;
    }

    public void disableSecondChances() {
        gamePool.removeIf(b -> b instanceof SecondChanceBox);
    }
}
