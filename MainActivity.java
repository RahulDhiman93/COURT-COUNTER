package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.teamB;

public class MainActivity extends AppCompatActivity {
int score=0;
    int score1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void teamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA);
        scoreView.setText(String.valueOf(score));
    }
    public void increment(View view){
score=score+2;
        teamA(score);
    }
    public void three(View view){
        score=score+3;
        teamA(score);
    }
    public void free(View view){
        score=score+1;
        teamA(score);
    }
    public void teamB(int score) {
        TextView scoreView = (TextView) findViewById(teamB);
        scoreView.setText(String.valueOf(score));
    }
    public void increment1(View view){
        score1=score1+2;
        teamB(score1);
    }
    public void three1(View view){
        score1=score1+3;
        teamB(score1);
    }
    public void free1(View view){
        score1=score1+1;
        teamB(score1);
    }
    public void reset(View view){
        score=0;
        score1=0;
        teamA(score);
        teamB(score1);
    }
}
