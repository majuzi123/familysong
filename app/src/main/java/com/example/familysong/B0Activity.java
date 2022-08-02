package com.example.familysong;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;


import java.util.HashMap;
import java.util.Map;


public class B0Activity extends AppCompatActivity  {
    private VideoView videoView,videoView1;
    private ImageView icon,icon1;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState)//生命周期
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b0);
        videoView=findViewById(R.id.videoplay);
        icon=findViewById(R.id.icon);
        videoView1=findViewById(R.id.videoplay1);
        icon1=findViewById(R.id.icon1);
        //创建视频资源的文件路径
        String url="android.resource://"+getPackageName()+"/"+R.raw.b;
        Uri uri= Uri.parse(url);
        videoView.setVideoURI(uri);//将要播放的视频路径指定给控件
        //创建一个视频的控制器
        mediaController=new MediaController(B0Activity.this);
        //J将控制器交给视频播放的控件
        videoView.setMediaController(mediaController);
        videoView1.setMediaController(mediaController);
        icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play1();
            }
        });
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play();
            }
        });


    }


    private void play() {
        if(videoView!=null&&videoView.isPlaying()){
            videoView.pause();
            icon.setImageResource(android.R.drawable.ic_media_play);
            return;
        }
        videoView.start();
        icon.setImageResource(android.R.drawable.ic_media_pause);


    }
    private void play1() {
        if(videoView1!=null&&videoView1.isPlaying()){
            videoView1.pause();
            icon1.setImageResource(android.R.drawable.ic_media_play);
            return;
        }
        videoView1.start();
        icon1.setImageResource(android.R.drawable.ic_media_pause);


    }



}