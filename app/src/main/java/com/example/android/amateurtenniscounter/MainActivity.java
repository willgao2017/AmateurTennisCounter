package com.example.android.amateurtenniscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int playerAGameScore = 0;
    int playerASetScore = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}


    public void scoreForPlayerA(View v){
        playerAGameScore++;
        playerASetScore++;
        displayForTeamA(playerAGameScore, playerASetScore);
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


}
