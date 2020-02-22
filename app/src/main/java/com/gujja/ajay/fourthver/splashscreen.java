package com.gujja.ajay.fourthver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splashscreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;
    ImageView splash_img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splashscreen);

        splash_img = findViewById(R.id.splash_image);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransistion);

        splash_img.setAnimation(myanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent SplashIntent = new Intent(splashscreen.this,HomeActivity.class);
                startActivity(SplashIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
