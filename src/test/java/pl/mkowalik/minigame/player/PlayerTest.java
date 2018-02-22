package pl.mkowalik.minigame.player;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PlayerTest {
    private final Player player = new Player();

    @Test
    public void new_player_have_no_rewards() {
        assertThat(player.getReward()).isEqualTo(0);
    }

    @Test
    public void new_player_have_life() {
        assertThat(player.hasLife()).isTrue();
    }

    @Test
    public void new_player_dont_have_secondChance() {
        assertThat(player.hasSecondChance()).isFalse();
    }

    @Test
    public void addReward_adds_reward(){
        player.addReward(10);
        assertThat(player.getReward()).isEqualTo(10);

        player.addReward(20);
        assertThat(player.getReward()).isEqualTo(30);
    }

    @Test
    public void takeLife_takes_life() {
        player.takeLife();
        assertThat(player.hasLife()).isFalse();
    }

    @Test
    public void addExtraLife_adds_life() {
        player.addExtraLife();
        player.takeLife();
        assertThat(player.hasLife()).isTrue();
    }

    @Test
    public void addSecondChance_adds_second_chance() {
        player.giveSecondChance();
        assertThat(player.hasSecondChance()).isTrue();
    }

    @Test
    public void useSecondChance_removes_second_chance() {
        player.giveSecondChance();
        player.useSecondChance();
        assertThat(player.hasSecondChance()).isFalse();
    }

    @Test
    public void useSecondChance_adds_life() {
        player.takeLife();
        player.giveSecondChance();
        player.useSecondChance();
        assertThat(player.hasLife()).isTrue();
    }

    @Test
    public void useSecondChance_dont_add_life_if_player_has_no_secondChance() {
        player.takeLife();
        player.useSecondChance();
        assertThat(player.hasLife()).isFalse();
    }
}