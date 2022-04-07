package Katas;

public class TennisGame {

    private String team1_actual_game_score = "love";
    private String team2_actual_game_score = "love";

    public String result() {
        return "[0, 0] " + team1_actual_game_score + " - " + team2_actual_game_score;
    }

    public void point_for_team1() {
        team1_actual_game_score = "15";
    }

    public void point_for_team2() {
        team2_actual_game_score = "15";
    }
}
