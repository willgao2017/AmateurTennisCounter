package com.example.android.amateurtenniscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int SCORES[] = {0, 15, 30, 40};
    int playerAScore = 0;
    int playerAGameScore;
    int playerASetScore = 0;

    int playerBScore = 0;
    int playerBGameScore;
    int playerBSetScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void scoreForPlayerA(View v) {
        playerAScore++;
        playerAGameScore = SCORES [playerAScore % 4];
        if (playerAGameScore == 0) {
            playerASetScore++;
            playerBScore = playerBGameScore = 0;
        }
        displayForTeamA(playerAGameScore, playerASetScore);
        displayForTeamB(playerBGameScore, playerBSetScore);

    }

    public void scoreForPlayerB(View v) {
        playerBScore++;
        playerBGameScore = SCORES [playerBScore % 4];
        if (playerBGameScore == 0) {
            playerBSetScore++;
            playerAScore = playerAGameScore = 0;
        }
        displayForTeamA(playerAGameScore, playerASetScore);
        displayForTeamB(playerBGameScore, playerBSetScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score1, int score2) {
        TextView gameScoreView = (TextView) findViewById(R.id.player_a_gamescore);
        TextView setScoreView = (TextView) findViewById(R.id.player_a_setscore);
        gameScoreView.setText(String.valueOf(score1));
        setScoreView.setText(String.valueOf(score2));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score1, int score2) {
        TextView gameScoreView = (TextView) findViewById(R.id.player_b_gamescore);
        TextView setScoreView = (TextView) findViewById(R.id.player_b_setscore);
        gameScoreView.setText(String.valueOf(score1));
        setScoreView.setText(String.valueOf(score2));
    }

}
