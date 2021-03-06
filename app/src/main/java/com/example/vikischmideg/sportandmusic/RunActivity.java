package com.example.vikischmideg.sportandmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class RunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run);

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView list = (ImageView) findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(RunActivity.this, LibraryActivity.class);
                startActivity(listIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView now = (ImageView) findViewById(R.id.nowPlaying);
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(RunActivity.this, NowPlayingActivity.class);
                startActivity(nowIntent);
            }
        });
    }
}
