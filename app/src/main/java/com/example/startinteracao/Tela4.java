package com.example.startinteracao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Tela4 extends AppCompatActivity {

    private static int TELA4 = 3500;
    MediaPlayer mp = new MediaPlayer();
    Animation bottomAnim;
    TextView escolha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        mp.stop();

        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        escolha = findViewById(R.id.name2View);

        escolha.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Tela4.this, Tela5.class);
                startActivity(intent);
                finish();
            }
        },TELA4);


    }
}
