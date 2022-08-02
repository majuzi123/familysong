package com.example.familysong.B.B4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.familysong.B.B3.B3Activity;
import com.example.familysong.B.B3.B3_skl1Activity;
import com.example.familysong.B.B3.B3_skl2Activity;
import com.example.familysong.B.BActivity;
import com.example.familysong.R;

public class B4_1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b41);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.b4_1);
        MediaPlayer mediaPlayer1=MediaPlayer.create(this,R.raw.ji4);
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
    public void qianye1(View view) {
        Intent intent=new Intent(B4_1Activity.this, BActivity.class);
        //执行意图
        startActivity(intent);
    }
    public void houye1(View view) {
        Intent intent=new Intent(B4_1Activity.this, B4_2Activity.class);
        //执行意图
        startActivity(intent);
    }

}