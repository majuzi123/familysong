package com.example.familysong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.B.BActivity;

public class yinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yin);
    }

    public void myclickb(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(yinActivity.this, BActivity.class);
        //执行意图
        startActivity(intent);
    }
}