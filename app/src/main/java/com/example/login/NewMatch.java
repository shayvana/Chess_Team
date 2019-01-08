package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import static com.example.login.R.layout.activity_main;
import static com.example.login.R.layout.newmatch;
import static com.example.login.R.layout.teampage;
import static com.example.login.R.menu.items;

/**
 * Created by Shayna on 12/17/2017.
 */

public class NewMatch extends AppCompatActivity {
    int teampagelayout;
    int newmatchlayout;
    int mainlayout;
    float score;
    TextView scoretotal;
    Button calcscore;
    Button goteampage;
    private RadioButton b1win,b1loss, b1draw, b2win, b2loss, b2draw, b3win, b3loss, b3draw, b4win, b4draw, b4loss, b5win, b5loss, b5draw, b6win, b6draw, b6loss, b7win, b7loss, b7draw, b8win, b8loss, b8draw;
    private RadioGroup board1radiogroup, board2radiogroup, board3radiogroup, board4radiogroup, board5radiogroup, board6radiogroup, board7radiogroup, board8radiogroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(newmatch);
        scoretotal = (TextView) findViewById(R.id.scoretext);
        teampagelayout = (teampage);
        newmatchlayout = (newmatch);
        mainlayout = (activity_main);
        calcscore=(Button)findViewById(R.id.calculatescore);
        goteampage=(Button)findViewById(R.id.teampage);
        b1win = (RadioButton) findViewById(R.id.board1win);
        b1loss = (RadioButton) findViewById(R.id.board1loss);
        b1draw = (RadioButton) findViewById(R.id.board1draw);
        b2win = (RadioButton) findViewById(R.id.board2win);
        b2loss = (RadioButton) findViewById(R.id.board2loss);
        b2draw = (RadioButton) findViewById(R.id.board2draw);
        b3win = (RadioButton) findViewById(R.id.board3win);
        b3loss = (RadioButton) findViewById(R.id.board3loss);
        b3draw = (RadioButton) findViewById(R.id.board3draw);
        b4win = (RadioButton) findViewById(R.id.board4win);
        b4loss = (RadioButton) findViewById(R.id.board4loss);
        b4draw = (RadioButton) findViewById(R.id.board4draw);
        b5win = (RadioButton) findViewById(R.id.board5win);
        b5loss = (RadioButton) findViewById(R.id.board5loss);
        b5draw = (RadioButton) findViewById(R.id.board5draw);
        b6win = (RadioButton) findViewById(R.id.board6win);
        b6loss = (RadioButton) findViewById(R.id.board6loss);
        b6draw = (RadioButton) findViewById(R.id.board6draw);
        b7win = (RadioButton) findViewById(R.id.board7win);
        b7loss = (RadioButton) findViewById(R.id.board7loss);
        b7draw = (RadioButton) findViewById(R.id.board7draw);
        b8win = (RadioButton) findViewById(R.id.board8win);
        b8loss = (RadioButton) findViewById(R.id.board8loss);
        b8draw = (RadioButton) findViewById(R.id.board8draw);
        board1radiogroup = (RadioGroup) findViewById(R.id.board1);
        board2radiogroup = (RadioGroup) findViewById(R.id.board2);
        board3radiogroup = (RadioGroup) findViewById(R.id.board3);
        board4radiogroup = (RadioGroup) findViewById(R.id.board4);
        board5radiogroup = (RadioGroup) findViewById(R.id.board5);
        board6radiogroup = (RadioGroup) findViewById(R.id.board6);
        board7radiogroup = (RadioGroup) findViewById(R.id.board7);
        board8radiogroup = (RadioGroup) findViewById(R.id.board8);

        score = 0;
        calcscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId1 = board1radiogroup.getCheckedRadioButtonId();
                int selectedId2 = board2radiogroup.getCheckedRadioButtonId();
                int selectedId3 = board3radiogroup.getCheckedRadioButtonId();
                int selectedId4 = board4radiogroup.getCheckedRadioButtonId();
                int selectedId5 = board5radiogroup.getCheckedRadioButtonId();
                int selectedId6 = board6radiogroup.getCheckedRadioButtonId();
                int selectedId7 = board7radiogroup.getCheckedRadioButtonId();
                int selectedId8 = board8radiogroup.getCheckedRadioButtonId();
                if(selectedId1 == b1win.getId()) {
                    score+=12;
                }
                else if(selectedId1 == b1draw.getId()) {
                    score+=6;
                }
                else {
                    score+=0;
                }
                if(selectedId2 == b2win.getId()) {
                    score+=11;
                }
                else if(selectedId2 == b2draw.getId()) {
                    score+=5.5;
                }
                else {
                    score+=0;
                }
                if(selectedId3 == b3win.getId()) {
                    score+=10;
                }
                else if(selectedId3 == b3draw.getId()) {
                    score+=5;
                }
                else {
                    score+=0;
                }
                if(selectedId4 == b4win.getId()) {
                    score+=9;
                }
                else if(selectedId4 == b4draw.getId()) {
                    score+=4.5;
                }
                else {
                    score+=0;
                }
                if(selectedId5 == b5win.getId()) {
                    score+=8;
                }
                else if(selectedId5 == b5draw.getId()) {
                    score+=4;
                }
                else {
                    score+=0;
                }
                if(selectedId6 == b6win.getId()) {
                    score+=7;
                }
                else if(selectedId6 == b6draw.getId()) {
                    score+=3.5;
                }
                else {
                    score+=0;
                }
                if(selectedId7 == b7win.getId()) {
                    score+=6;
                }
                else if(selectedId7 == b7draw.getId()) {
                    score+=3;
                }
                else {
                    score+=0;
                }
                if(selectedId8 == b8win.getId()) {
                    score+=5;
                }
                else if(selectedId8 == b8draw.getId()) {
                    score+=2.5;
                }
                else {
                    score+=0;
                }
                if(score>=34.5) {
                    scoretotal.setText("You won. Total Score: " + score);
                }
                else {
                    scoretotal.setText("You lost. Total Score: "+score);
                }
                score=0;
            }
        });
        goteampage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TeamPageActivity.class));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(items, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_teampage:
                startActivity(new Intent(getApplicationContext(),TeamPageActivity.class));
            case R.id.action_newmatch:
                startActivity(new Intent(getApplicationContext(),NewMatch.class));
            case R.id.action_logout:
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}