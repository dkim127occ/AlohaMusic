package edu.orangecoastcollege.cs273.dkim127.alohamusic;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashActivity.this, MediaActivity.class));
            }
        };

        // create a Timer object that launches the other activity
        Timer timer = new Timer();
        timer.schedule(timerTask, 3000);
    }
}
