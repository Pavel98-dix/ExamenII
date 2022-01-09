package com.example.examen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView ivIcono,ivLogo;
    TextView tvInicio;
    private final int DURACION_SPLASH=5400;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivIcono=findViewById(R.id.ivIcono);
        ivLogo=findViewById(R.id.ivLogo);
        tvInicio=findViewById(R.id.tvInicio);

        trans();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this,registros.class);
                startActivity(intent);
                finish();
            }
        },DURACION_SPLASH);
    }

    private void trans()
    {
        //Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.tralacion):
    }
}