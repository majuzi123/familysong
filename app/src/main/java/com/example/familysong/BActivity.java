package com.example.familysong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bactivity);
    }

    public void myclickb0(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(BActivity.this,B0Activity.class);
        //执行意图
        startActivity(intent);
    }
}