import Katas.TennisGame;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisGameTest {
    private TennisGame game;

/*
	TODO:
	- sets could be more than 1
	- config player's names
 */

    @Before
    public void setup() {
        game = new TennisGame();
    }

    @Test
    public void game_started() {
        assertEquals("[0, 0] love - love", game.result());
    }

    @Test
    public void point_for_team1 () {
        game.point_for_team1();
        assertEquals("[0, 0] 15 - love", game.result());
    }

    @Test
    public void point_for_team2 () {
        game.point_for_team1();
        game.point_for_team2();
        assertEquals("[0, 0] 15 - 15", game.result());
    }

    // more_points_for_team1

    // win_the_game
}
