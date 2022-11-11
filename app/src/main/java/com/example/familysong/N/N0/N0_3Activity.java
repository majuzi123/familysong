package com.example.familysong.N.N0;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.familysong.H.H0.H0_3Activity;
import com.example.familysong.R;

public class N0_3Activity extends AppCompatActivity {

    private VideoView videoView;
    private ImageView icon;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState)//生命周期
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n03);
        videoView=findViewById(R.id.videoplay);
        icon=findViewById(R.id.icon);
        //创建视频资源的文件路径
        String url="android.resource://"+getPackageName()+"/"+R.raw.n0hdy;
        Uri uri= Uri.parse(url);
        videoView.setVideoURI(uri);//将要播放的视频路径指定给控件
        //创建一个视频的控制器
        mediaController=new MediaController(N0_3Activity.this);
        //J将控制器交给视频播放的控件
        videoView.setMediaController(mediaController);
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
}