package com.rupp.kh.homesupplement;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        delayToStartWelcomeActivity();
    }

    private void delayToStartWelcomeActivity(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startWelcomeActivity();;
                finishStart_upActivity();
            }
        }, 3000);
    }

    private void startWelcomeActivity(){
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }

    private void finishStart_upActivity(){
        finish();
    }
}
