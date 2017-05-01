package com.example.vikischmideg.sportandmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView run = (ImageView) findViewById(R.id.run);
        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent runIntent = new Intent(MainActivity.this, RunActivity.class);
                startActivity(runIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView gym = (ImageView) findViewById(R.id.gym);
        gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gymIntent = new Intent(MainActivity.this, GymActivity.class);
                startActivity(gymIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView yoga = (ImageView) findViewById(R.id.yoga);
        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yogaIntent = new Intent(MainActivity.this, YogaActivity.class);
                startActivity(yogaIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView list = (ImageView) findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(listIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView now = (ImageView) findViewById(R.id.nowPlaying);
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowIntent);
            }
        });
    }
}
