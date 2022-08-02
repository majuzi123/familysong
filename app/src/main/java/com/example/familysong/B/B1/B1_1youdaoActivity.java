package com.example.familysong.B.B1;

import androidx.appcompat.app.AppCompatActivity;


import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;


import com.example.familysong.R;

public class B1_1youdaoActivity extends AppCompatActivity {
    private VideoView videoView1;
    private ImageView icon1;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState)//生命周期
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b11youdao);
        videoView1=findViewById(R.id.videoplay1);
        icon1=findViewById(R.id.icon1);
        //创建视频资源的文件路径
        String url1="android.resource://"+getPackageName()+"/"+R.raw.b0;
        Uri uri1= Uri.parse(url1);
       //将要播放的视频路径指定给控件
        videoView1.setVideoURI(uri1);
        //创建一个视频的控制器
        mediaController=new MediaController(B1_1youdaoActivity.this);
        //J将控制器交给视频播放的控件
        videoView1.setMediaController(mediaController);
        icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play1();
            }
        });


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