package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    ImageButton ImgA;
    MediaPlayer m;
    ImageButton ImgE;
    MediaPlayer I;
    ImageButton ImgI;
    MediaPlayer O;
    ImageButton ImgO;
    MediaPlayer U;
    ImageButton ImgU;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ImgA = (ImageButton) findViewById(R.id.ImgA);
        mp = MediaPlayer.create(this, R.raw.vocala);
        ImgA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });

        ImgE= (ImageButton) findViewById(R.id.ImgE);
        m=  MediaPlayer.create(this, R.raw.vocale);
        ImgE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.start();
            }
        });

        ImgI= (ImageButton) findViewById(R.id.ImgI);
        I =  MediaPlayer.create(this, R.raw.vocali);
        ImgI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                I.start();
            }
        });

        ImgO= (ImageButton) findViewById(R.id.ImgO);
        O =  MediaPlayer.create(this, R.raw.vocalo);
        ImgO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                O.start();
            }
        });


        ImgU= (ImageButton) findViewById(R.id.ImgU);
        U =  MediaPlayer.create(this, R.raw.vocalu);
        ImgU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                U.start();
            }
        });










    }

}

