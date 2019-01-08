package com.example.login;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import static com.example.login.R.layout.activity_main;
import static com.example.login.R.layout.newmatch;
import static com.example.login.R.layout.teampage;
import static com.example.login.R.menu.items;

/**
 * Created by Shayna on 12/17/2017.
 */

public class TeamPageActivity extends AppCompatActivity{
    int teampagelayout;
    int newmatchlayout;
    int mainlayout;
    Button newmatchbttn;
    Button conferenceresultsbttn;
    Button logoutbttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(teampage);
        teampagelayout = (teampage);
        newmatchlayout = (newmatch);
        mainlayout = (activity_main);
        newmatchbttn = (Button)findViewById(R.id.newmatchbutton);
        conferenceresultsbttn = (Button)findViewById(R.id.conferenceresultsbutton);
        logoutbttn = (Button)findViewById(R.id.logoutbutton);
        newmatchbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),NewMatch.class));
            }
        });
        conferenceresultsbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.webview);
                startActivity(new Intent(getApplicationContext(),WebViewActivity.class));
            }
        });
        logoutbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
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
