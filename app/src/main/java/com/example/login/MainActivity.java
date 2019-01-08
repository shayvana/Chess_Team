package com.example.login;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import static com.example.login.R.layout.activity_main;
import static com.example.login.R.layout.newmatch;
import static com.example.login.R.layout.teampage;
import static com.example.login.R.menu.items;


public class MainActivity extends AppCompatActivity {
    EditText uname,pswd;
    Button login;
    DBHandler db;
    int teampagelayout;
    int newmatchlayout;
    int mainlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        uname=(EditText)findViewById(R.id.uname);
        pswd=(EditText)findViewById(R.id.password);
        teampagelayout = (teampage);
        newmatchlayout = (newmatch);
        mainlayout = (activity_main);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=uname.getText().toString();
                String password=pswd.getText().toString();
                int id= checkUser(new User(name,password));
                if(id==-1)
                {
                    Toast.makeText(MainActivity.this,"User Does Not Exist, Creating New Team: "+name, Toast.LENGTH_SHORT).show();
                    db.addUser(new User(name, password));
                    startActivity(new Intent(getApplicationContext(),TeamPageActivity.class));
                }
                else
                {
                    Toast.makeText(MainActivity.this,"User Exists: "+name,Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),TeamPageActivity.class));
                }
            }
        });
        db=new DBHandler(MainActivity.this);
        }



    public int checkUser(User user)
    {
        return db.checkUser(user);
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
                setContentView(teampagelayout);
                startActivity(new Intent(this,TeamPageActivity.class));
            case R.id.action_newmatch:
                setContentView(newmatchlayout);
                startActivity(new Intent(this,NewMatch.class));
            case R.id.action_logout:
                setContentView(mainlayout);
                startActivity(new Intent(this,MainActivity.class));
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}