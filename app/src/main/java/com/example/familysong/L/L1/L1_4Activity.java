package com.example.familysong.L.L1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.familysong.R;

public class L1_4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l14);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.lnsg);
        MediaPlayer mediaPlayer1=MediaPlayer.create(this,R.raw.ji1);
        Button btn_play=(Button) findViewById(R.id.play);
        Button btn_pause=(Button) findViewById(R.id.pause);
        Button btn_stop=(Button) findViewById(R.id.stop);
        Button btn_play1=(Button) findViewById(R.id.play1);
        Button btn_pause1=(Button) findViewById(R.id.pause1);
        Button btn_stop1=(Button) findViewById(R.id.stop1);
        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        btn_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer!=null){
                    mediaPlayer.pause();}
            }
        });
        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer!=null){
                    mediaPlayer.stop();}
            }
        });
        btn_play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.start();
            }
        });
        btn_pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer1!=null){
                    mediaPlayer1.pause();}
            }
        });
        btn_stop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer1!=null){
                    mediaPlayer1.stop();}
            }
        });
    }



}