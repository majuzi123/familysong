package com.example.familysong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.B.BActivity;
import com.example.familysong.F.FActivity;
import com.example.familysong.H.HActivity;
import com.example.familysong.N.NActivity;

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

    public void myclickf(View view) {
        Intent intent=new Intent(yinActivity.this, FActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickh(View view) {
        Intent intent=new Intent(yinActivity.this, HActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickn(View view) {
        Intent intent=new Intent(yinActivity.this, NActivity.class);
        //执行意图
        startActivity(intent);
    }
}